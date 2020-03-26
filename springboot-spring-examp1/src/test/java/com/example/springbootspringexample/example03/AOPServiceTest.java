package com.example.springbootspringexample.example03;

import com.example.springbootspringexample.example03.joinpoint.AOPService03;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class AOPServiceTest {
    @Autowired
    private AOPService03 aopService03;
    @Test
    public void test_hello(){
        aopService03.hello("wangbo");
    }
}
