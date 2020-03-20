package com.example.springbootjpaexamples.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.util.UUID;

@Slf4j

public class UUIDTest {
   @Test
   public void test_uuid(){
       UUID uuid=UUID.randomUUID();
       log.debug("{}",uuid);
   }
}
