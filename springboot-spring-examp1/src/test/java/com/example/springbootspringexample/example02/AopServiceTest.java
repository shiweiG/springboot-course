package com.example.springbootspringexample.example02;

import com.example.springbootspringexample.example02.aop.AopService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class AopServiceTest {
    @Autowired
    private AopService aopService;
    @Test
    public void test_get(){
        aopService.get();
        log.debug("{}",aopService.getClass().getName());
    }
}
