package com.example.springbootjpaexamples.example07.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Address07 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detail;
    @OneToMany(mappedBy = "address07")
    private List<UserAddress>userAddresses;
    @Column( columnDefinition = "timestamp default current_timestamp" ,
            insertable = false,
            updatable = false)
    private LocalDateTime insertTime ;
}
