package com.example.springbootjpaexamples.example07.repository;

import com.example.springbootjpaexamples.example07.entity.Address07;
import com.example.springbootjpaexamples.example07.entity.User07;
import com.example.springbootjpaexamples.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  interface User07Repository extends BaseRepository<User07,Integer> {
    @Query("from User07  u where u.id=:aid")
    List<User07> list(@Param("aid")int aid);

    @Query("from User07 u where u.name=:name")
    List<User07> list(@Param("name") String name);

    List<User07> findByName(String name);
}

/*
@Query("select a.user from Address07 a where a.user.id=:uid")
    User07 find(@Param("uid") int uid);
 */