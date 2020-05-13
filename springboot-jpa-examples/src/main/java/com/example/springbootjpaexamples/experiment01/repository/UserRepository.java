package com.example.springbootjpaexamples.experiment01.repository;

import com.example.springbootjpaexamples.example02.User01;
import com.example.springbootjpaexamples.experiment01.entity.Address08;
import com.example.springbootjpaexamples.experiment01.entity.User08;
import com.example.springbootjpaexamples.repository.BaseRepository;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.security.PrivateKey;
import java.util.List;

@Repository
public class UserRepository{
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void addusers(){
        User08 u1=new User08();
        u1.setName("王波");

        Address08 a1=new Address08();
        a1.setDetail("上海");

        Address08 a2=new Address08();
        a2.setDetail("日本");

        entityManager.persist(u1);
        entityManager.persist(a1);
        entityManager.persist(a2);
        entityManager.flush();
    }
}
