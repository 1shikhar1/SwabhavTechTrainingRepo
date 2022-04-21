package com.monocept.model;

public class Rectangle {
	private int width;
	private int height;
	
	private int check(int side) {
		if(side<=0)
			return 1;
		
		if(side>100)
			return 100;
		
		return side;
	}
	
	public void setWidth(int width) {
		
		this.width = check(width);
	}
	
	public void setHeight(int height) {
		this.height = check(height);
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int calculateArea() {
		return width*height;
	}
}
