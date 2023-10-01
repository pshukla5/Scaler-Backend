package com.dev.scalerbackend.Repositories;

import com.dev.scalerbackend.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepo extends JpaRepository<Category, UUID> {
    Category findByNameEqualsIgnoreCase(String name);

    @Override
    Category save(Category category);
}
