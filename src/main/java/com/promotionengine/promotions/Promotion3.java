package com.promotionengine.promotions;

import com.promotionengine.model.Order;
import com.promotionengine.model.SKU;

public class Promotion3 implements Promotion {

	// Promotion- C & D for 30
	@Override
	public int applyPromotion(Order order) {
		int countOfC = (int) order.getItems().stream().filter(p -> SKU.C.equals(p)).count();
		int countOfD = (int) order.getItems().stream().filter(p -> SKU.D.equals(p)).count();
		int totalPrice = countOfC * SKU.C.getPrice() +  countOfD * SKU.D.getPrice();
		int priceAfterDisc;
		if (countOfC > countOfD)
			priceAfterDisc = ((countOfC - countOfD) * SKU.C.getPrice()) + (countOfD * 30);
		else if (countOfD > countOfC)
			priceAfterDisc = ((countOfD - countOfC) * SKU.D.getPrice()) + (countOfC * 30);
		else
			priceAfterDisc = countOfC * 30;
		return totalPrice - priceAfterDisc;
	}

}
