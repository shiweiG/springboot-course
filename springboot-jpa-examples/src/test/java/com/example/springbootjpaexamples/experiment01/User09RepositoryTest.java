package com.example.springbootjpaexamples.experiment01;

import com.example.springbootjpaexamples.experiment01.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class User09RepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void test_addStudent(){
        studentRepository.addStudentCourse();
    }

}
