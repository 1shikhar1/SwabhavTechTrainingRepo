package com.monocept.model;

import java.util.*;

public class Rectangle {
	private int width;
	private final int height;
	private String color;
	

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int width, int height, String color) {
		this.width = width;
		this.height = height;
		
		color = color.toLowerCase();
		
		if(checkAllowedColor(color)==true)
			this.color = color;
		else
			this.color = "red";
	}
	
	private boolean checkAllowedColor(String color){
		ArrayList<String> allowedColor = new ArrayList<>();
		allowedColor.add("red");
		allowedColor.add("blue");
		allowedColor.add("green");
		
		
		if(allowedColor.contains(color))
			return true;
		else
			return false;
	}

	private int check(int side) {
		if (side <= 0)
			return 1;

		if (side > 100)
			return 100;

		return side;
	}

	public void setWidth(int width) {

		this.width = check(width);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public void setColor(String color) {
		
		color = color.toLowerCase();
		if(checkAllowedColor(color)==true)
			this.color = color;
		else
			this.color = "red";
	}
	
	public String getColor() {
		return color;
	}

	public int calculateArea() {
		return width * height;
	}
}
