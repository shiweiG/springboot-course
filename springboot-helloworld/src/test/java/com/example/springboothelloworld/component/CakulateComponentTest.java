package com.example.springboothelloworld.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CakulateComponentTest {
    @Autowired
    private CakulateComponent cakulateComponent;
    @Test
    public void test_add(){
        Assertions.assertEquals(2, cakulateComponent.add(1, 1));
    }

}
