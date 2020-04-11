package com.example.springbootspringexample.example04;

import com.example.springbootspringexample.example04.aop.AOPService04;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class AOPTest {
  @Autowired
    private AOPService04 aopService04;
  @Test
    public void tets_getuser(){
      aopService04.getuser();
  }
  @Test
    public void test_getuser(){
      aopService04.getadmin();
  }
}
