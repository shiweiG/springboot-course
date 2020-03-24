package com.example.springbootjpaexamples.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class AddressOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detail;
    @ManyToOne
    private User01 user;


}
