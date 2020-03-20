package com.example.springbootjpaexamples.example;

import com.example.springbootjpaexamples.example01.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
/*@Rollback//测试结束会删掉事务*/
@Rollback(value = false)
@Transactional//事务：数据的的增删改查
@Slf4j
public class UserTets {
    @Autowired
    private EntityManager manager;
    @Test
    public void test_addUser(){
        User user=new User();
        user.setName("yao");
        user.setNumber("123456");
        manager.persist(user);
        log.debug("{}",user.getName(),user.getId());
    }
}
