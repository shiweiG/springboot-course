package com.example.springbootjpaexamples.experiment01.repository;

import com.example.springbootjpaexamples.experiment01.entity.Address08;
import com.example.springbootjpaexamples.experiment01.entity.Course08;
import com.example.springbootjpaexamples.experiment01.entity.Elective08;
import com.example.springbootjpaexamples.experiment01.entity.Student08;
import com.example.springbootjpaexamples.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.Date;

@Repository
public class StudentRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void addStudentCourse(){
        Student08 s1 = new Student08();
        s1.setName("张三");
        Student08 s2 = new Student08();
        s2.setName("李四");

        Course08 c1 = new Course08();
        c1.setName("语文");

        Elective08 e1 = new Elective08();
        e1.setCourse(c1);
        e1.setStudent(s1);


        Elective08 e2 = new Elective08();
        e2.setCourse(c1);
        e2.setStudent(s2);

        entityManager.persist(s1);
        entityManager.persist(s2);
        entityManager.persist(c1);
        entityManager.persist(e1);
        entityManager.persist(e2);

        entityManager.flush();
    }
}
