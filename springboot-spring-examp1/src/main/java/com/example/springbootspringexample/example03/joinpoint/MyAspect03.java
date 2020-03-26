package com.example.springbootspringexample.example03.joinpoint;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Component
@Slf4j
@Aspect
public class MyAspect03 {
    @Pointcut("execution(* com.example.springbootspringexample.example03..*.*(..))")
    public void  pointcut(){
    }
    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        log.debug(joinPoint.getTarget().getClass().getName());
        for (Object a:joinPoint.getArgs()){
         log.debug("{}",a);
        }
        log.debug(joinPoint.getThis().getClass().getName());
    }
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint)throws Throwable{
        Object[] objects=joinPoint.getArgs();
        objects[0]="sun";
        return joinPoint.proceed(objects);
    }
}
