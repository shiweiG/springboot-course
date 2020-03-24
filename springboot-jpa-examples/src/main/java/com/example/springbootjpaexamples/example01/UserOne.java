package com.example.springbootjpaexamples.example01;

import lombok.Data;
import lombok.NoArgsConstructor;
import sun.util.resources.LocaleData;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class UserOne {
    @Id
    @GeneratedValue
    @Column(length = 16)
    private UUID id;
    private String name;
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
