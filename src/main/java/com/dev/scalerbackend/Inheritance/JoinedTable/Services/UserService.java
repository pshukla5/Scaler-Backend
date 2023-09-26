package com.dev.scalerbackend.Inheritance.JoinedTable.Services;


import com.dev.scalerbackend.Inheritance.JoinedTable.Models.User;
import com.dev.scalerbackend.Inheritance.JoinedTable.Repositories.MentorRepo;
import com.dev.scalerbackend.Inheritance.JoinedTable.Repositories.StudentRepo;
import com.dev.scalerbackend.Inheritance.JoinedTable.Repositories.TARepo;
import com.dev.scalerbackend.Inheritance.JoinedTable.Repositories.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("jt_userService")
@AllArgsConstructor
public class UserService {

    MentorRepo mentorRepo;
    StudentRepo studentRepo;
    TARepo taRepo;
    UserRepo userRepo;

    public List<User> getAllUsers(){


        return userRepo.findAll();

    }

    public User save(User user){
        return userRepo.save(user);
    }


}
