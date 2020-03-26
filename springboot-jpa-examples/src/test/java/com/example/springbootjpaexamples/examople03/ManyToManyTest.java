package com.example.springbootjpaexamples.examople03;

import com.example.springbootjpaexamples.example03.Course01;
import com.example.springbootjpaexamples.example03.Elective;
import com.example.springbootjpaexamples.example03.Student01;
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
public class ManyToManyTest {
  @Autowired
  private EntityManager manager;
  @Test
    public void test_course01student01(){
      Student01 s=new Student01();
      s.setName("ysw");
      manager.persist(s);

      Student01 s1=new Student01();
      s1.setName("世维哥哥");
      manager.persist(s1);

      Course01 c=new Course01();
      c.setName("web框架");
      manager.persist(c);

  }
  @Test
  public void test_rel(){
   Student01 s=manager.find(Student01.class,1);
   Course01 c=manager.find(Course01.class,1);
    Elective elective=new Elective();
    elective.setDetail("因为喜欢");
    elective.setCourse(c);
    elective.setStudent(s);
    manager.persist(elective);
  }
}
