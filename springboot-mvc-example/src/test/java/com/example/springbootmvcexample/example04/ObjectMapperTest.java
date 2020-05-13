package com.example.springbootmvcexample.example04;

import com.example.springbootmvcexample.example04.entity.User04;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.TypeRef;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@Slf4j
@SpringBootTest
public class ObjectMapperTest {
    @Autowired
    private ObjectMapper objectMapper;
    @Test
    public void test_mapper(){
        User04 user04=new User04();
        user04.setUsername("wei");
        user04.setPassword("123456");
        try {
            String json=objectMapper.writeValueAsString(user04);
            log.debug(json);
            User04 u1=objectMapper.readValue(json,User04.class);
            log.debug(u1.getUsername());
            log.debug(u1.getPassword());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test_mapper2() throws JsonProcessingException {
        User04 u3=new User04();
        u3.setUsername("wei");
        u3.setPassword("123456");
        Map<String,User04> map =Map.of("user04",u3);
        String json=objectMapper.writeValueAsString(map);
        log.debug(json);
        Map<String,User04>remap=objectMapper.readValue(json, new TypeReference<Map<String, User04>>(){});

            remap.forEach((k,v)->{
                log.debug(k);
                log.debug(v.getUsername()+"/"+v.getPassword());});
        }
    }

