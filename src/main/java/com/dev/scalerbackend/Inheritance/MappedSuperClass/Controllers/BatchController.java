package com.dev.scalerbackend.Inheritance.MappedSuperClass.Controllers;


import com.dev.scalerbackend.Inheritance.MappedSuperClass.Models.Mentor;
import com.dev.scalerbackend.Inheritance.MappedSuperClass.Models.User;
import com.dev.scalerbackend.Inheritance.MappedSuperClass.Services.MentorService;
import com.dev.scalerbackend.Inheritance.MappedSuperClass.Services.StudentService;
import com.dev.scalerbackend.Inheritance.MappedSuperClass.Services.TAService;
import com.dev.scalerbackend.Inheritance.MappedSuperClass.Services.UserService;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class BatchController {
    UserService userService;
    MentorService mentorService;
    StudentService studentService;
    TAService taService;
    Gson gson;

//    How to use GSON
//    Gson gson = new Gson();
//    String json = gson.toJson(classObject);
//    ClassName var_name = gson.(json_string, ClassName.class)

    @GetMapping("/users")
    private List<User> getAllUsers(){

//        System.out.println("Accessing All Users");
//        return null;
        return userService.getAllUsers();
    }

    @PostMapping("/mentors")
    private Mentor saveMentor(@RequestBody Mentor mentor){
//        Mentor mentor = new Mentor();
//        mentor.setAvgRating(9.5);
//        mentor.setName("Prabhat");
//        mentor.setEmail("abc@gmail.com");
//        System.out.println(gson.toJson(mentor));
        return mentorService.saveMentor(mentor);

//        System.out.println("saving mentor");
//        return null;
    }


}
