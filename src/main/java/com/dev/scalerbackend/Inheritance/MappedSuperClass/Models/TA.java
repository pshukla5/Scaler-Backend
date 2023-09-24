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
@Entity(name = "ms_TA")
public class TA extends User {

    private double avgRating;
}
