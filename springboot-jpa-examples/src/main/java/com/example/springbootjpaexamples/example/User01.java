package com.example.springbootjpaexamples.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class User01 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "user")//mappedBy=user：放弃维护权;many为维护端
    private List<AddressOne>addresses;

}
