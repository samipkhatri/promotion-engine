package com.promotionengine.service;

import static com.promotionengine.service.PromotionService.PROMOTIONS;

import com.promotionengine.model.Order;

public class PromotionEngine {

	public int getPriceAfterDiscount(Order order) {
		return getTotalPrice(order) - getDiscount(order);
	}
	
	public int getTotalPrice(Order order) {
		return order.getItems().stream().mapToInt(p -> p.getPrice()).sum();
	}
	
	public int getDiscount(Order order) {
		return PROMOTIONS.stream().mapToInt(p -> p.applyPromotion(order)).sum();
	}
}
