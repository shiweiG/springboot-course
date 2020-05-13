package com.example.springbootmvcexample.example04.service;

import com.example.springbootmvcexample.example04.entity.User04;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import java.util.Map;

@Service
@Slf4j
public class UserService04 {
    private Map<String, User04> map =createUser();

    private Map<String, User04> createUser() {
        User04 u=new User04();
        u.setUsername("BO");
        //$2a$10$vbic.eN8nCmnzExjVIUUwOKsIAz0.NGEYC/IGwjWJHSCC8s37Kn9G
        u.setPassword("$2a$10$vbic.eN8nCmnzExjVIUUwOKsIAz0.NGEYC/IGwjWJHSCC8s37Kn9G");
        return Map.of("BO",u);
    }
    public User04 getUser(String username){
        return map.get(username);
    }
  /*  private Map<String, User04> map = createUser();
    private Map<String, User04> createUser() {
        User04 u = new User();
        u.setUserName("BO");
        // 123456
        u.setPassword("$2a$10$vbic.eN8nCmnzExjVIUUwOKsIAz0.NGEYC/IGwjWJHSCC8s37Kn9G");
        return Map.of("BO", u);
    }

    public User04 getUser(String userName) {
        return map.get(userName);
    }

*/
}
