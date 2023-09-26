package com.dev.scalerbackend.Inheritance.SingleTable.Repositories;

import com.dev.scalerbackend.Inheritance.SingleTable.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("st_studentRepo")
public interface StudentRepo extends JpaRepository<Student, Long> {

    @Override
    List<Student> findAll();

    @Override
    <S extends Student> S save(S entity);
}
