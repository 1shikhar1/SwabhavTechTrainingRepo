package com.monocept.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Customer;
import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

class CustomerUnitTest {
	Customer c1 = new Customer(1,"Rohan");
	
	Order o1 = new Order(10,"11/01/2022");
	
	@Test
	void customerDetailsTest() {
		assertEquals(c1.getId(), 1);
		assertEquals(c1.getName(), "Rohan");
		assertEquals(c1.getOrderCount(), 0);
	}
	
	@Test
	void addOrderTest() {
		assertEquals(c1.getOrderCount(), 0);
		c1.addOrder(o1);
		
		Product p1 = new Product(1000,"Samsung galaxy",15000,2000);
		LineItem l1 = new LineItem(100,3, p1);
		
		o1.addItem(l1);
		
		Product p2 = new Product(1001,"Iphone",75000,4000);
		LineItem l2 = new LineItem(101,4, p2);
		
		o1.addItem(l2);
		
		assertEquals(o1.getItemsCount(), 2);
		
		assertEquals(c1.getOrderCount(), 1);
	}
}
