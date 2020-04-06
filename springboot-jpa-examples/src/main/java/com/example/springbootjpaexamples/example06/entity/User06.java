package com.example.springbootjpaexamples.example06.entity;

import com.example.springbootjpaexamples.example06.entity.Address06;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class User06 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "user06")
    private List<Address06>addresses;

}
