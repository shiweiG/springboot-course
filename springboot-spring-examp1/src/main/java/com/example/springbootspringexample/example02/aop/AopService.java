package com.example.springbootspringexample.example02.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AopService {
    public void get(){
        log.debug("AOPService");
    }
}
