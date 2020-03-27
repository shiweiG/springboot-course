package com.example.springbootspringexample.example04.aop;

import org.springframework.stereotype.Component;

@Component
@MyAuthority
public class AOPService04 {
    public void getuser(){

    }
    @MyAuthority(value = MyAuthority.MyAuthorityType.admin)
    public void getadmin(){

    }


}
