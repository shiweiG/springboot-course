package com.example.springbootjpaexamples.experiment01.entity;

import com.example.springbootjpaexamples.example03.Course01;
import com.example.springbootjpaexamples.example03.Student01;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Elective08 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detail;
    @ManyToOne
    private Student08 student;
    @ManyToOne
    private Course08 course;

}
