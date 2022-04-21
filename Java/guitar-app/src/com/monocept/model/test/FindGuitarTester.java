package com.monocept.model.test;

import java.util.*;

import com.monocept.model.*;

public class FindGuitarTester {
	public static void main(String args[]) {
		Inventory inventory = new Inventory();
		inventory.addGuitar("GE12345", 12000, Builder.FENDER, "NEW100", Type.ELECTRIC, 10, Wood.INDIAN_ROSEWOOD, Wood.BRAZILLIAN_ROSEWOOD);
		inventory.addGuitar("GE12346", 9000, Builder.FENDER, "NEW102", Type.ELECTRIC, 6, Wood.INDIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
		inventory.addGuitar("GE12347", 11000, Builder.FENDER, "NEW102", Type.ELECTRIC, 6, Wood.INDIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
		inventory.addGuitar("GE12348", 14000, Builder.GIBSON, "NEW103", Type.ACOUSTIC, 12, Wood.BRAZILLIAN_ROSEWOOD, Wood.BRAZILLIAN_ROSEWOOD);
		inventory.addGuitar("GE12349", 14000, Builder.FENDER, "NEW104", Type.ELECTRIC, 12, Wood.BRAZILLIAN_ROSEWOOD, Wood.BRAZILLIAN_ROSEWOOD);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "NEW102", Type.ELECTRIC, 6, Wood.INDIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
		
		List<Guitar> lst = inventory.search(whatErinLikes);
		
		for(Guitar guitar: lst) {
			printDetails(guitar);
		}
	}
	
	public static void printDetails(Guitar guitar) {
		System.out.print("Serial number: "+guitar.getSerialNumber()+",");
		System.out.println("\tPrice: "+guitar.getPrice());
	}
}
