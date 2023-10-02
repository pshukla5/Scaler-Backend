package com.dev.scalerbackend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
public class Product extends BaseModel {

    private String title;
    private String description;
    private String image;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Price price;

    public Product() {

        this.title = "Iphone 15 Pro Max";
        this.description = "Everyone's dream phone";
        this.image = "https://fakeimage.com";
        this.category = new Category();
        this.price = new Price();
    }
}
