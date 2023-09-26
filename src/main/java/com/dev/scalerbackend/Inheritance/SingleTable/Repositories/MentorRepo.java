package com.dev.scalerbackend.Inheritance.SingleTable.Repositories;

import com.dev.scalerbackend.Inheritance.SingleTable.Models.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("st_mentorRepo")
public interface MentorRepo extends JpaRepository<Mentor, Long> {

    @Override
    List<Mentor> findAll();

    @Override
    <S extends Mentor> S save(S entity);
}
