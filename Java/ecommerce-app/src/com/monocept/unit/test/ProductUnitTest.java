package com.monocept.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Product;

class ProductUnitTest {
	Product p1 = new Product(1000,"Samsung galaxy",15000,2000);
	
	@Test
	void productDetailsTest() {
		assertEquals(p1.getId(),1000);
		assertEquals(p1.getName(),"Samsung galaxy");
		assertEquals(p1.getPrice(),15000);
		assertEquals(p1.getDiscount(),2000);
	}
	
	@Test
	void getPriceAfterDiscountTest() {
		assertEquals(p1.getPriceAfterDiscount(),13000);
	}
}
