package com.dev.scalerbackend;

import com.dev.scalerbackend.Inheritance.MappedSuperClass.Models.Mentor;
import com.dev.scalerbackend.Inheritance.MappedSuperClass.Repositories.MentorRepo;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScalerBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScalerBackendApplication.class, args);
        System.out.println("\nApplication Started\n");

        Gson gson = new Gson();

        Mentor mentor = new Mentor();
        mentor.setAvgRating(9.5);
        mentor.setName("Prabhat");
        mentor.setEmail("abc@gmail.com");


        System.out.println(gson.toJson(mentor));

    }

}
