package com.example.springbootjpaexamples.example02;

import com.example.springbootjpaexamples.example02.AddressOne;
import com.example.springbootjpaexamples.example02.User01;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class OneToManyTest {
    @Autowired
    private EntityManager manager;
    @Test
    public void test_adduser01address(){
        User01 user01=new User01();
        user01.setName("ysw");
        manager.persist(user01);

        AddressOne addressOne=new AddressOne();
        addressOne.setDetail("764");
        manager.persist(addressOne);

        AddressOne a1=new AddressOne();
        a1.setDetail("421");
        manager.persist(a1);
    }
 @Test
    public void test_rel(){
        AddressOne addressOne=manager.find(AddressOne.class,1);
        User01 user01=manager.find(User01.class,1);
        addressOne.setUser(user01);

        AddressOne a1=manager.find(AddressOne.class,2);
        a1.setUser(user01);

 }

}
