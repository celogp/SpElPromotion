package com.sw1tech.spel.service;

import com.sw1tech.spel.entity.DiscountPromotionRule;
import com.sw1tech.spel.repository.DiscountPromotionRuleRepository;
import com.sw1tech.spel.requestDto.OrderRequest;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class DiscountPromotionService {

    private DiscountPromotionRuleRepository discountRuleRepository;

    public double calculateDiscountPromotion(OrderRequest order) {
        List<DiscountPromotionRule> rules = discountRuleRepository.findAll();

        SpelExpressionParser parser = new SpelExpressionParser();
        double totalDiscount = 0;
        for (DiscountPromotionRule rule : rules) {
            StandardEvaluationContext context = new StandardEvaluationContext(order);

            var isMatch = Boolean.TRUE.equals(parser.parseExpression(rule.getCondition()).getValue(context, Boolean.class));
            if (isMatch) {
                totalDiscount += order.getTotalAmount() * (rule.getDiscountPercentage() / 100);
            }
        }
        return totalDiscount;
    }

}
