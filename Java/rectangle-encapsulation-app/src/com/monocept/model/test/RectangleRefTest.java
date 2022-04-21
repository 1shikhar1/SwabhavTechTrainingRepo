package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleRefTest {
	public static void main(String []args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(20);
		
		System.out.println("r1 height: "+r1.getHeight());
		System.out.println("r1 width: "+r1.getWidth());
		
		Rectangle r2;
		r2 = r1;
		
		System.out.println("r2 height: "+r2.getHeight());
		System.out.println("r2 width: "+r2.getWidth());
		
		r2.setWidth(100);
		
		System.out.println("r2 height: "+r2.getWidth());
		System.out.println("r1 width: "+r1.getWidth());
	}
}
