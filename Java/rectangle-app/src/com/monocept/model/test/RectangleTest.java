package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle small=new Rectangle();
		Rectangle big=new Rectangle();
		
		small.width=10;
		small.height=5;
		big.width=100;
		big.height=50;
		
		System.out.println("Small Rectangle Area: "+ small.calculateArea());
		System.out.println("Small Rectangle Width: "+small.width);
		System.out.println("Small Rectangle Height: "+small.height);
		
		System.out.println("Big Rectangle Area: "+ big.calculateArea());
		System.out.println("Big Rectangle Width: "+big.width);
		System.out.println("Big Rectangle Height: "+big.height);
	}

}
