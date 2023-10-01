package com.dev.scalerbackend.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
public class Price extends BaseModel {

    @Enumerated(EnumType.STRING)
    private Currency currency;
    private double price;

    public Price() {
        this.currency = Currency.INR;
        this.price = 120000.84;
    }
}
