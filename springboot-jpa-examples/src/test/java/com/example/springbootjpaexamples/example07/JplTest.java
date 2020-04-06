package com.example.springbootjpaexamples.example07;

import com.example.springbootjpaexamples.example07.entity.Address07;
import com.example.springbootjpaexamples.example07.entity.User07;
import com.example.springbootjpaexamples.example07.repository.Address07Repository;
import com.example.springbootjpaexamples.example07.repository.User07Repository;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.OutputBuffer;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.FloatSeqHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Slf4j
public class JplTest {
    @Autowired
    private User07Repository user07Repository;
    @Autowired
    private Address07Repository address07Repository;


    @Transactional
    @Rollback(value = false)
    @Test
    public void test_init(){
        User07 u1=new User07();
        u1.setName("bo");
        user07Repository.save(u1);

        User07 u2=new User07();
        u2.setName("sun");
        user07Repository.save(u2);

        Address07 a1=new Address07();
        a1.setDetail("764");
        a1.setUser07(u1);
        address07Repository.save(a1);

        Address07 a2=new Address07();
        a2.setDetail("763");
        a2.setUser07(u2);
        address07Repository.save(a2);


    }
    @Test
    public void test_listusers(){
        user07Repository.list("bo")
                .forEach(u->log.debug("{}",u.getName()));
    }
    @Test
    public void  test_listusers2(){
        address07Repository.list("764")
                .forEach(u->log.debug("{}",u.getName()));
    }
    @Test
    public void test_listusers3(){
        address07Repository.list("764","bo")
                .forEach(a->log.debug("{}",a.getId()));
    }
    @Test
    public void find_User(){
        user07Repository.findByName("bo")
                .forEach(u->log.debug("{}",u.getId()));

    }
    @Test
    public void test_page(){
        address07Repository.list("764", PageRequest.of(0,20))
                .getContent()
                .forEach(address07 -> log.debug("{}",address07.getUser07().getName()));
    }
    @Transactional
    @Rollback(value = false)
    @Test
    public void test_update(){
        user07Repository.update(1,"yao");
    }

}
