package com.example.springbootjpaexamples.example07;

import com.example.springbootjpaexamples.example07.entity.Address07;
import com.example.springbootjpaexamples.example07.entity.User07;
import com.example.springbootjpaexamples.example07.repository.User07Repository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Slf4j
@Rollback(value = false)
@Transactional
public class UserRepositoryTest {
    @Autowired
    private User07Repository user07Repository;
    @Test
    public void  test_user07repository(){
     user07Repository.list("bo")
             .forEach(u->log.debug("{}",u.getId()));


        }
        @Test
    public void test_user07(){
        user07Repository.list(1)
                .forEach(u->log.debug("{}",u.getName()));
        }
    }


