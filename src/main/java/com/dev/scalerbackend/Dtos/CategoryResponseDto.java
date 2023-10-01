package com.dev.scalerbackend.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class CategoryResponseDto {
    UUID uuid;
    String Name;
}
