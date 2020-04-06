package com.example.springbootjpaexamples.example06.service;

import com.example.springbootjpaexamples.example06.entity.Address06;
import com.example.springbootjpaexamples.example06.entity.User06;
import com.example.springbootjpaexamples.example06.repository.Address06Repository;
import com.example.springbootjpaexamples.example06.repository.User06Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class User06Service {
    @Autowired
    private User06Repository user06Repository;
    @Autowired
    private Address06Repository address06Repository;


    public void addAddress(Address06 address06)
    {
        address06Repository.save(address06);
    }
    public void addUser(User06 user06){
        user06Repository.save(user06);
    }
    public User06 getUser(int id){
        User06 user06=user06Repository.findById(id).orElse(null);
        user06.getAddresses()
                .forEach(address06 -> System.out.println(address06.getDetail()));
        return user06;
    }
    public  Address06 getAddress(int id){
        return address06Repository.findById(id).orElse(null);
    }
}
