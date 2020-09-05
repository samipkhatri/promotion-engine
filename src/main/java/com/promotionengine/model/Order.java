package com.promotionengine.model;

import java.util.List;

public class Order {
	private int orderId;
	private List<SKU> items;
	
	public Order(int orderId, List<SKU> items) {
		super();
		this.orderId = orderId;
		this.items = items;
	}

	public List<SKU> getItems() {
		return items;
	}

	public void setItems(List<SKU> items) {
		this.items = items;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
}
