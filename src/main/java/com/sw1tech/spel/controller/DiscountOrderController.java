package com.sw1tech.spel.controller;

import com.sw1tech.spel.requestDto.OrderRequest;
import com.sw1tech.spel.responseDto.OrderResponse;
import com.sw1tech.spel.service.DiscountPromotionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("order")
@RestController
public class DiscountOrderController {

    private DiscountPromotionService discountPromotionService;

    @PostMapping("discount")
    ResponseEntity<OrderResponse> doAdicionar(@Validated @RequestBody final OrderRequest orderRequest) {
        double calculateDiscountPromotion = discountPromotionService.calculateDiscountPromotion(orderRequest);
        var orderResponse = new OrderResponse();
        orderResponse.setTotalDiscount(calculateDiscountPromotion);
        return ResponseEntity.ok(orderResponse);
    }

}
