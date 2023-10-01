package com.dev.scalerbackend.Repositories;

import com.dev.scalerbackend.Models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PriceRepo extends JpaRepository<Price, UUID> {


}
