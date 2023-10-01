package com.dev.scalerbackend.Services;

import com.dev.scalerbackend.Models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public List<Product> getAllProducts();
    public Product getProductById(String uuid);
    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public String deleteProductById(String uuid);
}
