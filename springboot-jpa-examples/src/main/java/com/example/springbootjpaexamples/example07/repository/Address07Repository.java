package com.example.springbootjpaexamples.example07.repository;

import com.example.springbootjpaexamples.example07.entity.Address07;
import com.example.springbootjpaexamples.example07.entity.User07;
import com.example.springbootjpaexamples.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Address07Repository extends BaseRepository<Address07,Integer> {
    @Query("from Address07 a where a.id=:uid")
    List<Address07> list(@Param("uid")int uid);
}
