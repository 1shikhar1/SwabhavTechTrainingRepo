package com.monocept.model.test;

import com.monocept.model.*;

public class Test {
	public static void main(String args[]) {
		Hat hat = new RibbonedHat(new GoldenHat(new StandardHat()));
		
		printDetails(hat);
	}
	
	public static void printDetails(Hat hat) {
		System.out.println("Name: "+hat.getName());
		System.out.println("Details: "+hat.getDetails());
		System.out.println("Price: "+hat.getPrice());
	}
}
