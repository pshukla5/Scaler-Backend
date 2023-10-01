package com.dev.scalerbackend.Repositories;

import com.dev.scalerbackend.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepo extends JpaRepository<Product, UUID> {

}
