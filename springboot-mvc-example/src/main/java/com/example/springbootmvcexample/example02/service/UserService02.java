package com.example.springbootmvcexample.example02.service;

import com.example.springbootmvcexample.example02.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.processing.Filer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
@Service
public class UserService02 {
    public void addfile(){
        try {
            Files.readString(Path.of("A:/aa.aa"));
        } catch (IOException e) {
            throw new MyException("文件读取错误"+e.getMessage());
        }
    }
    public void addfile1(){
        try {
            Files.readString(Path.of("A:/aa.aa"));
        } catch (IOException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"您检索的文件不存在");
        }
    }
}
