package com.promotionengine.promotions;

import com.promotionengine.model.Order;
import com.promotionengine.model.SKU;

public class Promotion1 implements Promotion {

	// Promotion- 3 of A's for 130 
	public int applyPromotion(Order order) {
		int countOfA = (int) order.getItems().stream().filter(p -> SKU.A.equals(p)).count();
		int totalPrice = countOfA * SKU.A.getPrice();
		int div = countOfA / 3;
		int mod = countOfA % 3;
		int priceAfterDiscount = (div * 130) + (mod * SKU.A.getPrice());
		return totalPrice - priceAfterDiscount;
	}

}
