package com.dev.scalerbackend.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class GenericProductRequestDto {

    String title;
    double price;
    String category;
    String description;
    String image;
}
