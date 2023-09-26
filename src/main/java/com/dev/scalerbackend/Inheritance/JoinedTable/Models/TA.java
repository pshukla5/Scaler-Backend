package com.dev.scalerbackend.Inheritance.JoinedTable.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "jt_TA")
@PrimaryKeyJoinColumn(name = "user_id")
public class TA extends User {

    private double avgRating;

    public TA() {
        this.setName("TA");
        this.setEmail("TA@gmail.com");
        this.setAvgRating(9.5);
    }
}
