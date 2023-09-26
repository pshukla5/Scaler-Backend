package com.dev.scalerbackend.Inheritance.SingleTable.Services;


import com.dev.scalerbackend.Inheritance.SingleTable.Models.User;
import com.dev.scalerbackend.Inheritance.SingleTable.Repositories.MentorRepo;
import com.dev.scalerbackend.Inheritance.SingleTable.Repositories.StudentRepo;
import com.dev.scalerbackend.Inheritance.SingleTable.Repositories.TARepo;
import com.dev.scalerbackend.Inheritance.SingleTable.Repositories.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("st_userService")
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
