package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleArrayTest {
	public static void main(String []args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.setWidth(50);
		r1.setHeight(220);
		
		r2.setWidth(-30);
		r2.setHeight(80);
		
		Rectangle manyRectangles[] = new Rectangle[3];
		
		manyRectangles[0] = r1;
		manyRectangles[1] = r2;
		
		manyRectangles[2] = new Rectangle();
		manyRectangles[2].setWidth(10);
		manyRectangles[2].setHeight(10);
		
		for(Rectangle rectangle: manyRectangles) {
			System.out.println("Rectangle Area: "+rectangle.calculateArea());
			System.out.println("Rectangle Width: "+rectangle.getWidth());
			System.out.println("Rectangle Height: "+rectangle.getHeight());
			
			System.out.println("");
		}
	}
}
