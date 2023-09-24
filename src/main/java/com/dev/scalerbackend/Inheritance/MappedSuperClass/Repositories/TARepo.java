package com.dev.scalerbackend.Inheritance.MappedSuperClass.Repositories;

import com.dev.scalerbackend.Inheritance.MappedSuperClass.Models.TA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ms_TARepo")
public interface TARepo extends JpaRepository<TA, Long> {

    @Override
    List<TA> findAll();

    @Override
    <S extends TA> S save(S entity);
}
