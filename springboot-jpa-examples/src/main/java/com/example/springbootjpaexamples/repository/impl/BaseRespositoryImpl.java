package com.example.springbootjpaexamples.repository.impl;

import com.example.springbootjpaexamples.repository.BaseRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.PrimaryKeyJoinColumn;

public class BaseRespositoryImpl<T,ID> extends SimpleJpaRepository<T,ID> implements BaseRepository<T,ID> {
    private EntityManager manager;
    public BaseRespositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.manager=entityManager;
    }

    @Override
    public void refresh(T t) {
     manager.refresh(t);
    }
}
