package com.example.springbootjpaexamples.example07;

import com.example.springbootjpaexamples.example07.repository.Address07Repository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Slf4j
@Rollback(value = false)
@Transactional
public class AddressRepositoryTest {
    @Autowired
    private Address07Repository address07Repository;
    @Test
    public void test_address(){
        address07Repository.list(1)
                .forEach(a->log.debug("{}",a.getDetail()));
    }
}
