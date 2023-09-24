package com.dev.scalerbackend.Inheritance.TablePerClass.Models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "tpc_mentor")
public class Mentor extends User {

    private double avgRating;

    public Mentor() {
        this.setName("Mentor");
        this.setEmail("Mentor@gmail.com");
        this.setAvgRating(9.5);
    }
}
