package com.dev.scalerbackend.Controllers;

import com.dev.scalerbackend.Services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @DeleteMapping("/{uuid}")
    public String deleteProductById(@PathVariable String uuid){

        return productService.deleteProductById(uuid);
    }




}
