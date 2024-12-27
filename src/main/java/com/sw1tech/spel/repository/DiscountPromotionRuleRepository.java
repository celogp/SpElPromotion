package com.sw1tech.spel.repository;

import com.sw1tech.spel.entity.DiscountPromotionRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountPromotionRuleRepository extends JpaRepository<DiscountPromotionRule, Long> {
}
