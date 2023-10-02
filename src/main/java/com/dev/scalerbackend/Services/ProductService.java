package com.dev.scalerbackend.Services;

import com.dev.scalerbackend.Dtos.ProductRequestDto;
import com.dev.scalerbackend.Dtos.ProductResponseDto;
import com.dev.scalerbackend.Models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public List<ProductResponseDto> getAllProducts();
    public ProductResponseDto getProductById(String uuid);
    public ProductResponseDto addProduct(ProductRequestDto productRequestDto);
    public Product updateProduct(Product product);
    public String deleteProductById(String uuid);
}
