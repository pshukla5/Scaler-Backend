package com.dev.scalerbackend.Dtos;

import com.dev.scalerbackend.Models.Price;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDto {
    UUID id;
    String title;
    Price price;
    String description;
    String image;
    CategoryResponseDto categoryResponseDto;
}
