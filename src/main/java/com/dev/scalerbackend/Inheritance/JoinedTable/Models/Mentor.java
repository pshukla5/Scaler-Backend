package com.dev.scalerbackend.Inheritance.JoinedTable.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "jt_mentor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User {

    private double avgRating;

    public Mentor() {
        this.setName("Mentor");
        this.setEmail("Mentor@gmail.com");
        this.setAvgRating(9.5);
    }
}
