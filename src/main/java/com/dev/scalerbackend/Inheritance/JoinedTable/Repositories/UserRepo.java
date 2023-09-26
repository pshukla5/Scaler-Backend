package com.dev.scalerbackend.Inheritance.JoinedTable.Repositories;

import com.dev.scalerbackend.Inheritance.JoinedTable.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("jt_userRepo")
public interface UserRepo extends JpaRepository<User,Long> {

    @Override
//    @Query(value = "select id, name, email from jt_user" , nativeQuery = false)
//    @Query("select u1_0.id,u1_0.email,u1_0.name from jt_user u1_0")
    List<User> findAll();
}
