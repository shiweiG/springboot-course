package com.example.springbootjpaexamples.example07.repository;

import com.example.springbootjpaexamples.example07.entity.Address07;
import com.example.springbootjpaexamples.example07.entity.User07;
import com.example.springbootjpaexamples.repository.BaseRepository;
import jdk.nashorn.internal.objects.annotations.Where;
import org.hibernate.sql.Select;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

;import javax.persistence.criteria.From;
import java.util.List;

@Repository
public interface Address07Repository extends BaseRepository<Address07,Integer> {
    @Query("select a.user07   from Address07 a where a.detail=:detail")
    List<User07>list(@Param("detail")String detail);

    @Query("from Address07 a where a.detail=:detail and a.user07.name=:name")
    List<Address07>list(@Param("detail")String detail,@Param("name")String name);


    @Query("from Address07 a where a.detail=:detail")
    Page<Address07>list(@Param("detail")String detail, Pageable pageable);
}
