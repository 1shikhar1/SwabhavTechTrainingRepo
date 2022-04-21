package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest {
	public static void main(String []args) {
		Rectangle small = new Rectangle();
		Rectangle big = new Rectangle();
		
		small.setWidth(50);
		small.setHeight(220);
		
		big.setWidth(-30);
		big.setHeight(80);
		
		System.out.println("Small Rectangle Area: "+ small.calculateArea());
		System.out.println("Small Rectangle Width: "+small.getWidth());
		System.out.println("Small Rectangle Height: "+small.getHeight());
		
		System.out.println("Big Rectangle Area: "+ big.calculateArea());
		System.out.println("Big Rectangle Width: "+big.getWidth());
		System.out.println("Big Rectangle Height: "+big.getHeight());
	}
}
