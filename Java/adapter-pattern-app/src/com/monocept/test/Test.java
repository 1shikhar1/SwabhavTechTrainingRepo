package com.monocept.test;

import com.monocept.model.HatAdapter;
import com.monocept.model.ShoppingCart;
import com.monocpt.model.Hat;

public class Test {
	public static void main(String args[]) {
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem(new HatAdapter(new Hat("Golden","Golden Premium", 999)));
		cart.addItem(new HatAdapter(new Hat("Brown","Brown Premium", 1299)));
		
		System.out.println(cart.getDetails());
	}
}
