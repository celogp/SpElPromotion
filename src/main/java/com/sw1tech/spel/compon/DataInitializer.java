package com.sw1tech.spel.compon;

import com.sw1tech.spel.entity.DiscountPromotionRule;
import com.sw1tech.spel.repository.DiscountPromotionRuleRepository;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@NoArgsConstructor
@Component
public class DataInitializer implements CommandLineRunner {

    private DiscountPromotionRuleRepository repository;

    public DataInitializer(DiscountPromotionRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.saveAll(Arrays.asList(
                new DiscountPromotionRule("customerAge > 60", 10),
                new DiscountPromotionRule("membershipLevel == 'GOLD'", 15),
                new DiscountPromotionRule("membershipLevel == 'SILVER'", 5),
                new DiscountPromotionRule("totalAmount > 100", 20)
        ));
    }

}
