package com.example.springbootjpaexamples.example07;

import com.example.springbootjpaexamples.example07.repository.UserAddressRepository;
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
public class UserAddressRepositoryTest {
    @Autowired
    private UserAddressRepository userAddressRepository;
    @Test
    public void test_userAddressRepository(){
        userAddressRepository.list(1)
                .forEach(ua->log.debug("{}",ua.getAddress07().getDetail()));
    }
}
