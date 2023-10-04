package com.dev.scalerbackend.Controllers;

import com.dev.scalerbackend.Dtos.GenericProductRequestDto;
import com.dev.scalerbackend.Dtos.GenericProductResponseDto;
import com.dev.scalerbackend.Services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    @GetMapping("/products")
    public List<GenericProductResponseDto> getAllProducts() {


        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public GenericProductResponseDto getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @GetMapping("/products/categories")
    public List<String> getAllCategories() {
        return productService.getAllCategories();
    }

    @GetMapping("/products/category/{category}")
    public List<GenericProductResponseDto> getInCategory(@PathVariable String category) {

//        System.out.println(category);


        return productService.getInCategory(category);
    }

    public GenericProductResponseDto addProduct(
            GenericProductRequestDto genericProductRequestDto
    ) {
        return null;
    }

    public GenericProductResponseDto updateProuct(Long id,
                                                  GenericProductRequestDto genericProductRequestDto
    ) {
        return null;
    }

    public GenericProductResponseDto deleteProduct(Long id) {
        return null;
    }
}
