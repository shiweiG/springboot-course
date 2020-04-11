package com.example.springbootmvcexample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private Integer id;
    private String detail;
    private String comment;
    private User user;
    private LocalDateTime inertTime;

public Address( Integer id,String detail,String comment,LocalDateTime inertTime){
    this.id=id;
    this.detail=detail;
    this.comment=comment;
    this.inertTime=inertTime;
}
}