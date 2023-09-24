package com.dev.scalerbackend.Inheritance.TablePerClass.Models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "tpc_TA")
public class TA extends User {

    private double avgRating;

    public TA() {
        this.setName("TA");
        this.setEmail("TA@gmail.com");
        this.setAvgRating(9.5);
    }
}
