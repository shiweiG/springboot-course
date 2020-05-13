package com.example.springbootmvcexample.example04;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.awt.*;
import java.util.Base64;
import java.util.Random;

@Slf4j
@SpringBootTest
public class PasswordEncoderTest {
    @Autowired
    private PasswordEncoder encoder;
    @Test
    public void test_password(){
        String pwd="123456";
        Random r=new Random();
        byte[] rb=new byte[16];
        r.nextBytes(rb);
        log.debug(new String(rb));
        String result= Base64.getEncoder().encodeToString(rb);
        log.debug(result);
        log.debug("{}",result.length());
    }
    @Test
    public void test_password2(){
        String pwd="123456";
        String result=encoder.encode(pwd);
        log.debug(encoder.encode(pwd));
        log.debug("{}",encoder.matches("12345",result));
        log.debug("{}",encoder.matches("123456",result));

    }
}
