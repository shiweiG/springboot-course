package com.example.springbootmvcexample.example02.controller;

import com.example.springbootmvcexample.example02.entity.User01;
import com.example.springbootmvcexample.example02.service.UserService02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/example02/")
public class Controller02 {
    @Autowired
    private UserService02 userService02;
    @GetMapping("exception")
    public void getException(){
        userService02.addfile();
    }
    @GetMapping("exception2")
    public void getException2(){
        userService02.addfile1();
    }
    @PostMapping("login")
    public void login(@RequestBody User01 user01){
        if (!("bo".equals(user01.getUsername())&&"123456".equals(user01.getPassword()))){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"用户密码不正确");
        }
    }

}
