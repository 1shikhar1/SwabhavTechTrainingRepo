package com.monocept.model.test;

import com.monocept.model.ShapeMaker;

public class FacadeTest {
	
	public static void main(String args[]) {
		ShapeMaker shapeMaker = new ShapeMaker();
	
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
