package com.promotionengine.promotions;

import com.promotionengine.model.Order;

public interface Promotion {
	
	int applyPromotion(Order order);
}
