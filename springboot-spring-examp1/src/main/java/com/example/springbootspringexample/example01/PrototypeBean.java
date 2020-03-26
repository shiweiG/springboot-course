package com.example.springbootspringexample.example01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PrototypeBean {
    @Autowired
    private PrototypeBean prototypeBean;
    public void getProto(){

       log.debug("prototype in singleton:{}",prototypeBean);
    }

}
