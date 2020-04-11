package com.example.springbootspringexample.example04.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
@Slf4j
public class MyAuthorityspect {
    @Around("@annotation(myAuthority)")
    public Object checkMethod(ProceedingJoinPoint joinPoint, MyAuthority myAuthority)throws  Throwable{
       Object obj=joinPoint.proceed();
       for (MyAuthority.MyAuthorityType au:myAuthority.value()){
        log.debug("{}",au);
       }
       return obj;
    }
    @Around("@within(myAuthority)")
    public Object checkType(ProceedingJoinPoint joinPoint, MyAuthority myAuthority) throws Throwable {
        Object obj=joinPoint.proceed();
        MethodSignature ms= (MethodSignature) joinPoint.getSignature();
        if(ms.getMethod().getAnnotation(MyAuthority.class)!=null){
            return obj;
        }
        for (MyAuthority.MyAuthorityType au:myAuthority.value()){
            log.debug("{}",au);
        }

       return obj;
    }

}
