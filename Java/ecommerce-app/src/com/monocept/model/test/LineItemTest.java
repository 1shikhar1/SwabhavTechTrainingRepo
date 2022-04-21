package com.monocept.model.test;

import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

public class LineItemTest {
	public static void main(String args[]) {
		
		Product p1 = new Product(1000,"Samsung galaxy",15000,2000);
		
		LineItem l1 = new LineItem(100,3, p1);
		
		System.out.println(l1);
		
	}
}
