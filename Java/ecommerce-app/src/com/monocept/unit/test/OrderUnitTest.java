package com.monocept.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

class OrderUnitTest {
	Product p1 = new Product(1000,"Samsung galaxy",15000,2000);
	
	LineItem l1 = new LineItem(100,3, p1);
	
	Order o1 = new Order(10,"11/01/2022");
	
	@Test
	void orderDetailsTest() {
		assertEquals(o1.getId(),10);
		assertEquals(o1.getDate(),"11/01/2022");
		assertEquals(o1.getItemsCount(),0);
	}
	
	@Test
	void addItemTest() {
		assertEquals(o1.getItemsCount(),0);
		o1.addItem(l1);
		assertEquals(o1.getItemsCount(),1);
	}

}
