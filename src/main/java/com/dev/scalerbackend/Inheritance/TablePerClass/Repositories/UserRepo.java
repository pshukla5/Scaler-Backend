package com.dev.scalerbackend.Inheritance.TablePerClass.Repositories;

import com.dev.scalerbackend.Inheritance.TablePerClass.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("tpc_userRepo")
public interface UserRepo extends JpaRepository<User,Long> {

}
