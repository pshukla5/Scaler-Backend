package com.dev.scalerbackend.Inheritance.MappedSuperClass.Models;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "ms_mentor")
public class Mentor extends User {

    private double avgRating;

}
