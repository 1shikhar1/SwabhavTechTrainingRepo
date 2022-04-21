package com.monocept.model;

import java.util.*;

public class Inventory {
	private List<Guitar> guitars;
	
	public Inventory() {
		guitars = new LinkedList();
	}
	
	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
		GuitarSpec spec = new GuitarSpec(builder, model, type, numStrings, backWood, topWood);
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for(Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSerialNumber().equals(serialNumber)){
				return guitar;
			}
		}
		return null;
	}
	
	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars = new LinkedList();
		
		for(Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSpec().matches(searchSpec))
				matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}	
}
