package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle small = new Rectangle(10,5);
		printDetails(small);
	}
	
	static void printDetails(Rectangle r)
	{
		System.out.println("Rectangle Area: "+ r.calculateArea());
		System.out.println("Rectangle Width: "+r.getWidth());
		System.out.println("Rectangle Height: "+r.getHeight());
	}
	
}
