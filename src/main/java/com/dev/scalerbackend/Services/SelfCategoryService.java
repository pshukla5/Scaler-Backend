package com.dev.scalerbackend.Services;

import com.dev.scalerbackend.Models.Category;
import com.dev.scalerbackend.Models.Product;
import com.dev.scalerbackend.Repositories.CategoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service
@AllArgsConstructor
public class SelfCategoryService implements CategoryService{

    private CategoryRepo categoryRepo;

    @Override
    public List<String> getAllCategory() {
        List<Category> categories = categoryRepo.findAll();

        List<String> categorynames = new ArrayList<>();
        categories.forEach(category -> categorynames.add(category.getName()));

        return  categorynames;
    }

    @Override
    public List<Product> getProductByCategory(String uuid) {
        return categoryRepo.findById(UUID.fromString(uuid)).get().getProducts();
    }

    @Override
    public Category addCategory(Category category) {

        return categoryRepo.save(category);
    }



}
