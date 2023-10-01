package com.dev.scalerbackend.Repositories;

import com.dev.scalerbackend.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProductRepo extends JpaRepository<Product, UUID> {
    @Override
    void deleteById(UUID uuid);

    List<Product> findAllByCategory_Id(UUID uuid);
}
