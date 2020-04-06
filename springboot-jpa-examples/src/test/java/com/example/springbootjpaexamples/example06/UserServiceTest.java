package com.example.springbootjpaexamples.example06;

import com.example.springbootjpaexamples.example06.entity.Address06;
import com.example.springbootjpaexamples.example06.entity.User06;
import com.example.springbootjpaexamples.example06.repository.User06Repository;
import com.example.springbootjpaexamples.example06.service.User06Service;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserServiceTest {
    @Autowired
    private User06Service user06Service;
    @Test
    public void init(){
        User06 user06=new User06();
        user06.setName("bo");
        user06Service.addUser(user06);

        Address06 a1=new Address06();
        a1.setDetail("764");
        a1.setUser06(user06);
        user06Service.addAddress(a1);

        Address06 a2=new Address06();
        a2.setDetail("harbin");
        a2.setUser06(user06);
        user06Service.addAddress(a2);
    }
    @Test
    public void test_fetch(){
        log.debug(user06Service.getAddress(1).getUser06().getName());
    }
    @Test
    public void test_fetch1(){
   User06 user06=user06Service.getUser(1);

    }
}
