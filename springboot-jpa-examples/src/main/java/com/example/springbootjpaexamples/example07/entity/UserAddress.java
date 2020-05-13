package com.example.springbootjpaexamples.example07.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private User07 user07;
    @ManyToOne
    private Address07 address07;
    @Column( columnDefinition = "timestamp default current_timestamp" ,
            insertable = false,
            updatable = false)
    private LocalDateTime insertTime ;
}
