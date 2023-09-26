package com.dev.scalerbackend.Inheritance.JoinedTable.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Entity(name = "jt_student")
@PrimaryKeyJoinColumn(name = "user_id")
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
