package com.dev.scalerbackend.Inheritance.SingleTable.Repositories;

import com.dev.scalerbackend.Inheritance.SingleTable.Models.TA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("st_TARepo")
public interface TARepo extends JpaRepository<TA, Long> {

    @Override
    List<TA> findAll();

    @Override
    <S extends TA> S save(S entity);
}
