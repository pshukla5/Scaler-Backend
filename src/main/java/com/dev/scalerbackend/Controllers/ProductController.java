package com.dev.scalerbackend.Controllers;

import com.dev.scalerbackend.Dtos.ProductRequestDto;
import com.dev.scalerbackend.Dtos.ProductResponseDto;
import com.dev.scalerbackend.Services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @GetMapping("/demo")
    public String check(){

        return "Success";
    }

    @DeleteMapping("/{uuid}")
    public String deleteProductById(@PathVariable String uuid){

        return productService.deleteProductById(uuid);
    }

    @PutMapping("/")

    public ProductResponseDto addProduct(@RequestBody ProductRequestDto productRequestDto){

        return productService.addProduct(productRequestDto);
    }



}
