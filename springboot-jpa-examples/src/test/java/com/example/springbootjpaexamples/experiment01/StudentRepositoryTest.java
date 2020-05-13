package com.example.springbootjpaexamples.experiment01;

import com.example.springbootjpaexamples.experiment01.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void test_addUser(){
    userRepository.addusers();
    }
}
