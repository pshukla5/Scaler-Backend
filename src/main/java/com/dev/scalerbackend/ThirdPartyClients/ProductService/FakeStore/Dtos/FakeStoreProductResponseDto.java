package com.dev.scalerbackend.ThirdPartyClients.ProductService.FakeStore.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FakeStoreProductResponseDto {

    Long id;
    String title;
    double price;
    String category;
    String description;
    String image;
}
