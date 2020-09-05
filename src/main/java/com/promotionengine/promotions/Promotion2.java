package com.promotionengine.promotions;

import com.promotionengine.model.Order;
import com.promotionengine.model.SKU;

public class Promotion2 implements Promotion {

	// Promotion- 2 of B's for 45 
	@Override
	public int applyPromotion(Order order) {
		int countOfB = (int) order.getItems().stream().filter(p -> SKU.B.equals(p)).count();
		int totalPrice = countOfB * SKU.B.getPrice();
		int div = countOfB / 2;
		int mod = countOfB % 2;
		int priceAfterDiscount = (div * 45) + (mod * SKU.B.getPrice());
		return totalPrice - priceAfterDiscount;
	}

}
