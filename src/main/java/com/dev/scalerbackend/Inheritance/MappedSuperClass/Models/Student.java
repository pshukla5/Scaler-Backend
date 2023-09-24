package com.dev.scalerbackend.Inheritance.MappedSuperClass.Models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ms_student")
public class Student extends User{

    private double psp;
    private double attendance;

}
