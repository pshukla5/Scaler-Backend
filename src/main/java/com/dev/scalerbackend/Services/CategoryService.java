package com.dev.scalerbackend.Services;

import com.dev.scalerbackend.Models.Category;
import com.dev.scalerbackend.Models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {

    public List<String> getAllCategory();
    public List<Product> getProductByCategory(String uuid);
}
