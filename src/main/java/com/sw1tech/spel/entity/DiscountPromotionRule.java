package com.sw1tech.spel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DiscountPromotionRule {
    @Id
    @GeneratedValue
    private Long id;

    private final String condition;
    private final double discountPercentage;

    public DiscountPromotionRule(String condition, double discountPercentage) {
        this.condition = condition;
        this.discountPercentage = discountPercentage;
    }

    public String getCondition() {
        return this.condition;
    }

    public double getDiscountPercentage() {
        return this.discountPercentage;
    }
}
