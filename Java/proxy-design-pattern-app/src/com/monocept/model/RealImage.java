package com.monocept.model;

public class RealImage implements Image {
	String fileName;
	
	public RealImage(String fileName){
		this.fileName = fileName;
		
		System.out.println("Image loaded");
	}

	@Override
	public void display() {
		System.out.println(fileName);
	}
	
}
