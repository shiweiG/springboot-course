package com.example.springbootjpaexamples.example01;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

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

}
