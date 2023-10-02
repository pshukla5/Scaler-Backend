package com.dev.scalerbackend.Controllers;

import com.dev.scalerbackend.Dtos.ProductResponseDto;
import com.dev.scalerbackend.Models.Product;
import com.dev.scalerbackend.Repositories.ProductRepo;
import com.dev.scalerbackend.Services.CategoryService;
import com.dev.scalerbackend.Services.ProductService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;
    private ProductService productService;

    @GetMapping("")
    public List<String> getAllCategories(){
        return categoryService.getAllCategory();
    }

    @GetMapping("/{uuid}")
    public List<ProductResponseDto> getPrductByCategoryId(@PathVariable String uuid) {

        return productService.getPrductByCategoryId(uuid);
    }
}
