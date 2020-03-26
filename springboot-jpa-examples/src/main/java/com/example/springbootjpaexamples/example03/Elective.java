package com.example.springbootjpaexamples.example03;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class Elective {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detail;
    @ManyToOne
    private Student01 student;
    @ManyToOne
    private Course01 course;


}
