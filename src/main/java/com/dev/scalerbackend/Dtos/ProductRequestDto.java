package com.dev.scalerbackend.Dtos;


import com.dev.scalerbackend.Models.Price;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ProductRequestDto {
    UUID uuid;
    String title;
    Price price;
    String description;
    String image;
    String category_name;
}
