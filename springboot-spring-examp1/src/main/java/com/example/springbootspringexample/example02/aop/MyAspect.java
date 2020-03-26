package com.example.springbootspringexample.example02.aop;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

import java.security.PublicKey;

@Component
@Aspect
@Slf4j
public class MyAspect {
    @Pointcut("execution(* com.example.springbootspringexample.example02.aop..*.*(..))")
    public void pointcut(){

    }
    @Before("pointcut()")
    public void  before(){
        log.debug("before()");
    }
    @After("pointcut()")
     public void after(){
        log.debug("after()");
    }

}
