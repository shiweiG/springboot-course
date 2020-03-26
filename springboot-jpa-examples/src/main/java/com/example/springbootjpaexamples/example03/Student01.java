package com.example.springbootjpaexamples.example03;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Student01 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "student")
    private List<Elective>electives;
    @Column( columnDefinition = "timestamp default current_timestamp" ,
            insertable = false,
            updatable = false)
    private LocalDateTime insertTime ;
    @Column( columnDefinition = "timestamp default current_timestamp"+
            " on update current_timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime updateTime;
}
