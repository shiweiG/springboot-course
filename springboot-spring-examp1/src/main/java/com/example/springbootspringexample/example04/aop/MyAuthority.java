package com.example.springbootspringexample.example04.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME )
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface MyAuthority {
    MyAuthorityType[] value() default MyAuthorityType.user;

    public enum MyAuthorityType {
      user,admin,superadmin



    }
}
