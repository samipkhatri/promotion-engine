package com.promotionengine.model;

public enum SKU {
	A(50), B(30), C(20), D(15);
	
	private int price;
	
	SKU(int price) {
		this.price = price;
	}
	
}

