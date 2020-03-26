package com.example.springbootspringexample.example03.joinpoint;


import org.springframework.stereotype.Component;

@Component
public class AOPService03 {
 public String hello(String name){
     return "welcome"+name;
 }
}
