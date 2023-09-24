package com.dev.scalerbackend.Inheritance.TablePerClass.Services;


import com.dev.scalerbackend.Inheritance.TablePerClass.Models.User;
import com.dev.scalerbackend.Inheritance.TablePerClass.Repositories.MentorRepo;
import com.dev.scalerbackend.Inheritance.TablePerClass.Repositories.StudentRepo;
import com.dev.scalerbackend.Inheritance.TablePerClass.Repositories.TARepo;
import com.dev.scalerbackend.Inheritance.TablePerClass.Repositories.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("tpc_userService")
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
