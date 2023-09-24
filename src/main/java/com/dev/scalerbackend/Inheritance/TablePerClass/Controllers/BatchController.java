package com.dev.scalerbackend.Inheritance.TablePerClass.Controllers;


import com.dev.scalerbackend.Inheritance.TablePerClass.Models.Mentor;
import com.dev.scalerbackend.Inheritance.TablePerClass.Models.Student;
import com.dev.scalerbackend.Inheritance.TablePerClass.Models.TA;
import com.dev.scalerbackend.Inheritance.TablePerClass.Models.User;
import com.dev.scalerbackend.Inheritance.TablePerClass.Services.MentorService;
import com.dev.scalerbackend.Inheritance.TablePerClass.Services.StudentService;
import com.dev.scalerbackend.Inheritance.TablePerClass.Services.TAService;
import com.dev.scalerbackend.Inheritance.TablePerClass.Services.UserService;
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


    @GetMapping("/users")
    private List<User> getAllUsers(){

        return userService.getAllUsers();
    }

    @PostMapping("/users")
    private User saveUser(){

        return userService.save(new User());
    }

    @GetMapping("/mentors")
    private List<Mentor> findAllMentor(){

        return mentorService.findAllMentors();
    }

    @PostMapping("/mentors")
    private Mentor saveMentor(){

        return mentorService.saveMentor(new Mentor());
    }

    @GetMapping("/tas")
    private List<TA> findAllTA(){

        return taService.findAllTa();
    }

    @PostMapping("/tas")
    private TA saveTA(){

        return taService.saveTa(new TA());
    }

    @GetMapping("/students")
    private List<Student> findAllStudent(){

        return studentService.findAllStudent();
    }

    @PostMapping("/students")
    private Student saveStudent(){

        return studentService.saveStudent(new Student());
    }


}
