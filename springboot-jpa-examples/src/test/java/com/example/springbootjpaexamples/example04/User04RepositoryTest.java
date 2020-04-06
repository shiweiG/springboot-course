package com.example.springbootjpaexamples.example04;

import com.example.springbootjpaexamples.example04.entity.User04;
import com.example.springbootjpaexamples.example04.repository.User04Repository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Transactional
@Slf4j
@Rollback(value = false)
public class User04RepositoryTest {
    @Autowired
    private User04Repository user04Repository;
    @Autowired
    private EntityManager manager;

    @Test
    public void test_user() {
        User04 user04 = new User04();
        user04.setName("bo");
        user04Repository.save(user04);
        user04.setName("sun");

        log.debug("hello");

    }
    @Test
    public void test_adduser2(){
     User04 user04=user04Repository.findById(1).orElse(null);
     user04.setName("sun");
     log.debug("{}",user04.getUpdateTime());
    }
    @Test
    public void test_adduser3(){
        User04 user04=new User04();
        user04.setId(2);
        user04Repository.save(user04);
    }
    @Test
    public void test_adduser4() {
        User04 user04 = new User04();
        user04.setName("bo");
        user04Repository.save(user04);
        log.debug("{}",user04.getId());
        log.debug("{}",user04.getUpdateTime());
    }
    @Test
    public void test_refresh(){
       User04 user04=new User04();
       user04.setName("sun");
       manager.persist(user04);
       user04.setName("bo");
       manager.persist(user04);
       manager.refresh(user04);
       log.debug("{}",user04.getName());
       log.debug("{}",user04.getUpdateTime());
       log.debug("{}",user04.getId());

    }
    @Test
    public void test_refresh2(){
        User04 user04=new User04();
        user04.setName("sun");
       user04Repository.save(user04);
       user04Repository.refresh(user04);
        log.debug("{}",user04.getName());
        log.debug("{}",user04.getUpdateTime());
        log.debug("{}",user04.getId());
    }
}

