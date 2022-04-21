package com.monocept.model.test;

import com.monocept.model.BorderOptions;
import com.monocept.model.Circle;

public class CircleTest {
	public static void main(String args[]) {
		Circle small = new Circle(5.5f);
		Circle big = new Circle(7.5f, BorderOptions.DOTTED);

//		printDetails(small);
//		printDetails(big);

		Circle[] circles = new Circle[4];

		circles[0] = new Circle(5.5f);
		circles[1] = new Circle(7.5f, BorderOptions.DOTTED);
		circles[2] = new Circle(10.5f);
		circles[3] = new Circle(3.5f);
		
		System.out.println("Biggest circle: ");
		printDetails(findLargestCircle(circles));
	}

	public static void printDetails(Circle circle) {
		System.out.println("Area: " + circle.calculateArea());
		System.out.println("Radius: " + circle.getRadius());
		System.out.println("Border: " + circle.getBorder());
	}

	public static Circle findLargestCircle(Circle circles[]) {
		Circle largestCircle = null;
		float maxRadius = 0;

		for (Circle circle : circles) {
			if (maxRadius < circle.getRadius()) {
				maxRadius = circle.getRadius();
				largestCircle = circle;
			}
		}

		return largestCircle;
	}
}