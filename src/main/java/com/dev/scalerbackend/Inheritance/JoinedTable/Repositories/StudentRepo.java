package com.dev.scalerbackend.Inheritance.JoinedTable.Repositories;

import com.dev.scalerbackend.Inheritance.JoinedTable.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("jt_studentRepo")
public interface StudentRepo extends JpaRepository<Student, Long> {

    @Override
    List<Student> findAll();

    @Override
    <S extends Student> S save(S entity);
}
