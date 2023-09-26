package com.dev.scalerbackend.Inheritance.JoinedTable.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "jt_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    public User() {
        this.setName("User");
        this.setEmail("User@gmail.com");
    }

}
