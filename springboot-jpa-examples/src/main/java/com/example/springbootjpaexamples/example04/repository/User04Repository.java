package com.example.springbootjpaexamples.example04.repository;

import com.example.springbootjpaexamples.example04.entity.User04;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User04Repository extends JpaRepository<User04,Integer> {

}
