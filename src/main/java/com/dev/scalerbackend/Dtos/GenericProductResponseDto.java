package com.dev.scalerbackend.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class GenericProductResponseDto {

    Long id;
    String title;
    double price;
    String category;
    String description;
    String image;
}
