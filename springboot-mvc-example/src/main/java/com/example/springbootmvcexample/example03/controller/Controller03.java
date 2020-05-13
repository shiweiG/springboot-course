package com.example.springbootmvcexample.example03.controller;

import com.example.springbootmvcexample.example03.entity.User02;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Map;

@Slf4j
@RequestMapping("/api/example03/")
@RestController
@Validated
public class Controller03 {
    @PostMapping("users")
    public Map postUsers(@Valid @RequestBody User02 user02){
        return Map.of();
    }
    @GetMapping("users/{uid}/file")
    public void getTypeMismatchException(@PathVariable int uid){

    }
    @GetMapping("users/{owner}")
    public void getViolationException(@Size(min = 2,max = 6,message = "用户信息错误")@PathVariable String owner){


    }



}
