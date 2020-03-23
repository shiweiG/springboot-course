package com.example.springbootjpaexamples.example01;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.time.LocalDate;

@SpringBootTest
@Slf4j
@Rollback(value = false)
@Transactional
public class UserOneTest {
    @Autowired
    private EntityManager Manage;
    @Test
    public void test_addUserOne(){
        UserOne userOne=new UserOne();
        userOne.setName("shi");
        userOne.setBirthday(LocalDate.of(1998,5,1));
        Manage.persist(userOne);
        log.debug("{}",userOne.getName());
    }

}
