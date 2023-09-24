package com.dev.scalerbackend;

import com.dev.scalerbackend.Inheritance.MappedSuperClass.Models.Mentor;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScalerBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScalerBackendApplication.class, args);
        System.out.println("\nApplication Started\n");

    }

}
