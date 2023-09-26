package com.dev.scalerbackend.Inheritance.SingleTable.Models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Entity(name = "st_student")
@DiscriminatorValue("Student")
public class Student extends User {

    private double psp;
    private double attendance;

    public Student() {
        this.setName("Student");
        this.setEmail("Student@gmail.com");
        this.setPsp(92.5);
        this.setAttendance(80);
    }

}
