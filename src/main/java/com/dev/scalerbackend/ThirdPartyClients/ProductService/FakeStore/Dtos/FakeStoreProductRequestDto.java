package com.dev.scalerbackend.ThirdPartyClients.ProductService.FakeStore.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FakeStoreProductRequestDto {

    String title;
    double price;
    String category;
    String description;
    String image;
}
