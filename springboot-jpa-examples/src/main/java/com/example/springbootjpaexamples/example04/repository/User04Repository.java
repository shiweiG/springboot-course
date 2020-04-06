package com.example.springbootjpaexamples.example04.repository;

import com.example.springbootjpaexamples.example04.entity.User04;
import com.example.springbootjpaexamples.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User04Repository extends BaseRepository<User04,Integer> {

}
