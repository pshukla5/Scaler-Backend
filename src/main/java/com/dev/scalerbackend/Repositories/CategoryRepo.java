package com.dev.scalerbackend.Repositories;

import com.dev.scalerbackend.Models.Category;
import com.dev.scalerbackend.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CategoryRepo extends JpaRepository<Category, UUID> {

}
