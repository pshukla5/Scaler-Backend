package com.dev.scalerbackend.Services;

import com.dev.scalerbackend.Models.Product;
import com.dev.scalerbackend.Repositories.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SelfProductService implements ProductService{

    ProductRepo productRepo;
    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(String uuid) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public String deleteProductById(String uuid) {
        productRepo.deleteById(UUID.fromString(uuid));
        return "Product with id " + uuid + " deleted";
    }
}
