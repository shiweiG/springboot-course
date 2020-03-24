package com.example.springbootjpaexamples.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import sun.java2d.loops.GeneralRenderer;
import sun.security.x509.GeneralName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String course;


}
