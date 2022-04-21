package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleColorTest {
	public static void main(String args[]) {
		Rectangle small = new Rectangle(10,5,"pink");
		printDetails(small);
	}
	
	static void printDetails(Rectangle r)
	{
		System.out.println("Rectangle Area: "+ r.calculateArea());
		System.out.println("Rectangle Width: "+r.getWidth());
		System.out.println("Rectangle Height: "+r.getHeight());
		System.out.println("Rectangle Height: "+r.getColor());
	}
}
