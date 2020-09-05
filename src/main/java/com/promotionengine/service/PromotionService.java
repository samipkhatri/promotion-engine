package com.promotionengine.service;

import java.util.ArrayList;
import java.util.List;

import com.promotionengine.promotions.Promotion;
import com.promotionengine.promotions.Promotion1;
import com.promotionengine.promotions.Promotion2;
import com.promotionengine.promotions.Promotion3;

public class PromotionService {

	public static final List<Promotion> PROMOTIONS;
	
	// initial promotions to apply
	static {
		PROMOTIONS = new ArrayList<>();
		PROMOTIONS.add(new Promotion1());
		PROMOTIONS.add(new Promotion2());
		PROMOTIONS.add(new Promotion3());
	}
	
	// To add new promotions in future
	public void addPromotions(Promotion promo) {
		PROMOTIONS.add(promo);
	} 
}
