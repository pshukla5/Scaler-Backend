package com.dev.scalerbackend.Dtos;


import com.dev.scalerbackend.Models.Price;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDto {
    String title;
    Price price;
    String description;
    String image;
    String category_name;
}
