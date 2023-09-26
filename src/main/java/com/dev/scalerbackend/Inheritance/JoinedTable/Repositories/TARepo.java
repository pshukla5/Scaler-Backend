package com.dev.scalerbackend.Inheritance.JoinedTable.Repositories;

import com.dev.scalerbackend.Inheritance.JoinedTable.Models.TA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("jt_TARepo")
public interface TARepo extends JpaRepository<TA, Long> {

    @Override
    List<TA> findAll();

    @Override
    <S extends TA> S save(S entity);
}
