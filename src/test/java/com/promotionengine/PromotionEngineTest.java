package com.promotionengine;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.promotionengine.model.SKU;
import com.promotionengine.model.Order;
import com.promotionengine.service.PromotionEngine;

public class PromotionEngineTest {
	
	@InjectMocks
	PromotionEngine promotionEngine;
	
	@Before
	public void intit() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void scenarioA() {
		List<SKU> items = new ArrayList<SKU>();
		items.add(SKU.A);
		items.add(SKU.B);
		items.add(SKU.C);
		Order order = new Order(1, items);
		int discountedPrice = promotionEngine.getPriceAfterDiscount(order);
		assertEquals(100, discountedPrice);
	}
	
	@Test
	public void scenarioB() {
		List<SKU> items = new ArrayList<SKU>();
		items.add(SKU.A);
		items.add(SKU.A);
		items.add(SKU.A);
		items.add(SKU.A);
		items.add(SKU.A);
		items.add(SKU.B);
		items.add(SKU.B);
		items.add(SKU.B);
		items.add(SKU.B);
		items.add(SKU.B);
		items.add(SKU.C);
		Order order = new Order(2, items);
		int discountedPrice = promotionEngine.getPriceAfterDiscount(order);
		assertEquals(370, discountedPrice);
	}
	
	@Test
	public void scenarioC() {
		List<SKU> items = new ArrayList<SKU>();
		items.add(SKU.A);
		items.add(SKU.A);
		items.add(SKU.A);
		items.add(SKU.B);
		items.add(SKU.B);
		items.add(SKU.B);
		items.add(SKU.B);
		items.add(SKU.B);
		items.add(SKU.C);
		items.add(SKU.D);
		Order order = new Order(1, items);
		int discountedPrice = promotionEngine.getPriceAfterDiscount(order);
		assertEquals(280, discountedPrice);
	}
	
	

}
