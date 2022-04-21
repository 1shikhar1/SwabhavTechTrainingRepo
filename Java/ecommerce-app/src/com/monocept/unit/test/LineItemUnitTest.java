package com.monocept.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

class LineItemUnitTest {
	Product p1 = new Product(1000,"Samsung galaxy",15000,2000);
	
	LineItem l1 = new LineItem(100,3, p1);
	
	@Test
	void lineItemDetailsTest() {
		assertEquals(l1.getId(),100);
		assertEquals(l1.getQuantity(),3);
		assertEquals(l1.getProduct(),p1);
	}
	
	@Test
	void getItemCostTest() {
		assertEquals(l1.getItemCost(),45000);
	}
	
	void getItemCostAfterDiscountTest() {
		assertEquals(l1.getItemCostAfterDiscount(),39000);
	}

}
