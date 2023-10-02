package com.dev.scalerbackend.Controllers;

import com.dev.scalerbackend.Dtos.ProductRequestDto;
import com.dev.scalerbackend.Dtos.ProductResponseDto;
import com.dev.scalerbackend.Services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @PostMapping("")

    public ProductResponseDto addProduct(@RequestBody ProductRequestDto productRequestDto){

        return productService.addProduct(productRequestDto);
    }

    @GetMapping("")

    public List<ProductResponseDto> getAllProducts(){

        return productService.getAllProducts();
    }

    @GetMapping("/{uuid}")
    public ProductResponseDto getProductById (@PathVariable String uuid) {

        return productService.getProductById(uuid);
    }

    @PutMapping("/{uuid}")
    public ProductResponseDto updateProductById(
            @PathVariable String uuid,
            @RequestBody ProductRequestDto productRequestDto){

        return productService.updateProductById(productRequestDto, uuid);
    }



}
