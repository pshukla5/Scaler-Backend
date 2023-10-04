package com.dev.scalerbackend.Services;

import com.dev.scalerbackend.Dtos.GenericProductRequestDto;
import com.dev.scalerbackend.Dtos.GenericProductResponseDto;

import java.util.List;

public interface ProductService {

    public List<GenericProductResponseDto> getAllProducts();
    public GenericProductResponseDto getProductById(Long id);
    public List<String> getAllCategories();
    public List<GenericProductResponseDto> getInCategory(String category);

    public GenericProductResponseDto addProduct(
            GenericProductRequestDto genericProductRequestDto
    );

    public GenericProductResponseDto updateProuct(
            Long id, GenericProductRequestDto genericProductRequestDto
    );

    public GenericProductResponseDto deleteProduct(Long id);

}
