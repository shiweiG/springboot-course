package com.example.springbootjpaexamples.example07.repository;

import com.example.springbootjpaexamples.example07.entity.UserAddress;
import com.example.springbootjpaexamples.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserAddressRepository extends BaseRepository<UserAddress,Integer> {
@Query("from UserAddress ua where ua.address07.id=:uaid")
    List<UserAddress>list(@Param("uaid") int uaid);
}
