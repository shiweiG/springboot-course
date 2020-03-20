package com.example.springbootjpaexamples.example02;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.boot.model.relational.Namespace;
import sun.security.util.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class UserOne {
    @Id
    @GeneratedValue
    @Column(length = 6)
    private UUID id;
    private String name;


}
