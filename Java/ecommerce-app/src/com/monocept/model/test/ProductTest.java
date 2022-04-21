package com.monocept.model.test;

import com.monocept.model.Product;

public class ProductTest {
public static void main(String args[]) {
		
		Product p1 = new Product(1000,"Samsung galaxy",15000,2000);
		System.out.println(p1);
		System.out.println("Price after discount: "+p1.getPriceAfterDiscount());
		
	}
}
