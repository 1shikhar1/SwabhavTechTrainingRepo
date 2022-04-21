package com.monocept.model;

public class Circle {
	private final float radius;
	private final BorderOptions border;

	public Circle(float radius) {
		this.border = BorderOptions.SOLID;
		this.radius = radius;
	}

	public Circle(float radius, BorderOptions border) {
		this.radius = radius;
		this.border = border;
	}

	public float calculateArea() {
		return (float) (radius * Math.PI);
	}

	public float getRadius() {
		return radius;
	}

	public BorderOptions getBorder() {
		return border;
	}
}