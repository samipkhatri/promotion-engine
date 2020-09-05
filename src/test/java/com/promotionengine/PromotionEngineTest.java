package com.promotionengine;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.promotionengine.model.Order;

public class PromotionEngineTest {
	
	@InjectMocks
	PromotionEngine promotionEngine;
	
	@Before
	public void intit() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void scenarioA() {
		Order order = new Order();
		int price = promotionEngine.getTotalPrice(order);
		assertEquals(100, price);
	}
	
	@Test
	public void scenarioB() {
		Order order = new Order();
		int price = promotionEngine.getTotalPrice(order);
		assertEquals(370, price);
	}
	
	@Test
	public void scenarioC() {
		Order order = new Order();
		int price = promotionEngine.getTotalPrice(order);
		assertEquals(280, price);
	}
	
	

}
