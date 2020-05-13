package com.example.springbootjpaexamples.example07;

import com.example.springbootjpaexamples.example.User;
import com.example.springbootjpaexamples.example07.entity.Address07;
import com.example.springbootjpaexamples.example07.entity.User07;
import com.example.springbootjpaexamples.example07.entity.UserAddress;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Slf4j
@Rollback(value = false)
@Transactional
public class dataTest {
    @Autowired
    private EntityManager manager;
    @Test
    public void test_rel(){
        User07 user=new User07();
        user.setName("bo");
        manager.persist(user);

        User07 user1=new User07();
        user1.setName("yao");
        manager.persist(user1);

        Address07 address07=new Address07();
        address07.setDetail("764");
        manager.persist(address07);

        Address07 address071=new Address07();
        address071.setDetail("925");
        manager.persist(address071);

        Address07 address072=manager.find(Address07.class,1);
        User07 user07=manager.find(User07.class,1);
        UserAddress userAddress=new UserAddress();
        userAddress.setAddress07(address072);
        userAddress.setUser07(user07);
        manager.persist(userAddress);
    }

}
