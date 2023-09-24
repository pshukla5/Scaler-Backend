package com.dev.scalerbackend.Inheritance.TablePerClass.Models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Entity(name = "tpc_student")
public class Student extends User{

    private double psp;
    private double attendance;

    public Student() {
        this.setName("Student");
        this.setEmail("Student@gmail.com");
        this.setPsp(92.5);
        this.setAttendance(80);
    }

}
