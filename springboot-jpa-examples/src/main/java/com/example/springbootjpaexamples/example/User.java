package com.example.springbootjpaexamples.example;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增长主键
/*@GeneratedvValue
* private UUID id;*/
//    @Column(name ="name",length = 16)
    private int id;
    @Column(length = 16)
    private String name;
    private String number;
    private LocalDate birthday;
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
