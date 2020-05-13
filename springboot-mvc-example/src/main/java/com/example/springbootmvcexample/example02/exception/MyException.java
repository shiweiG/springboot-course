package com.example.springbootmvcexample.example02.exception;
//自定义非受检异常
public class MyException extends RuntimeException {
    public MyException(String message){
        super(message);
    }
}
