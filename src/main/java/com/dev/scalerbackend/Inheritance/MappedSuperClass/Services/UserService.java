package com.dev.scalerbackend.Inheritance.MappedSuperClass.Services;


import com.dev.scalerbackend.Inheritance.MappedSuperClass.Models.User;
import com.dev.scalerbackend.Inheritance.MappedSuperClass.Repositories.MentorRepo;
import com.dev.scalerbackend.Inheritance.MappedSuperClass.Repositories.StudentRepo;
import com.dev.scalerbackend.Inheritance.MappedSuperClass.Repositories.TARepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("ms_userService")
@AllArgsConstructor
public class UserService {

    MentorRepo mentorRepo;
    StudentRepo studentRepo;
    TARepo taRepo;

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        users.addAll(mentorRepo.findAll());
        users.addAll(studentRepo.findAll());
        users.addAll(taRepo.findAll());

        return users;

    }


}
