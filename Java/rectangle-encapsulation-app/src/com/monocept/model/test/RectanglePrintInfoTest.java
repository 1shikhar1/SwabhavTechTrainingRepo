package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectanglePrintInfoTest {
	public static void main(String []args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(20);
		printDetails(r1);
		
		Rectangle r2 = new Rectangle();
		r2.setWidth(100);
		r2.setHeight(200);
		printDetails(r2);
	}
	
	static void printDetails(Rectangle r) {
		System.out.println("Rectangle height: "+r.getWidth());
		System.out.println("Rectangle width: "+r.getHeight());
		System.out.println("Rectangle Area: "+r.calculateArea());
	}
}
