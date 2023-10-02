package com.dev.scalerbackend.Controllers;

import com.dev.scalerbackend.Services.CategoryService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping("")
    public List<String> getAllCategories(){
        return categoryService.getAllCategory();
    }
}
