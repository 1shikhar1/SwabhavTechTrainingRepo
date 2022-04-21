package com.monocept.model.test;

import java.util.*;

import com.monocept.model.*;

public class InventoryTest {
	public static void main(String args[]) {
		Inventory guitarInventory = new Inventory();
		Inventory mandolinInventory = new Inventory();
		
		guitarInventory.addInstrument("GE12345", 12000, new GuitarSpec(Builder.FENDER, "NEW100", Type.ELECTRIC, 10, Wood.INDIAN_ROSEWOOD, Wood.BRAZILLIAN_ROSEWOOD));
		guitarInventory.addInstrument("GE12346", 9000, new GuitarSpec(Builder.FENDER, "NEW101", Type.ELECTRIC, 6, Wood.INDIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD));
		guitarInventory.addInstrument("GE12347", 11000, new GuitarSpec(Builder.FENDER, "NEW102", Type.ELECTRIC, 6, Wood.INDIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD));
		guitarInventory.addInstrument("GE12348", 14000, new GuitarSpec(Builder.GIBSON, "NEW103", Type.ACOUSTIC, 12, Wood.BRAZILLIAN_ROSEWOOD, Wood.BRAZILLIAN_ROSEWOOD));
		guitarInventory.addInstrument("GE12349", 14000, new GuitarSpec(Builder.FENDER, "NEW104", Type.ELECTRIC, 12, Wood.BRAZILLIAN_ROSEWOOD, Wood.BRAZILLIAN_ROSEWOOD));
		
		mandolinInventory.addInstrument("MO12345", 24000, new MandolinSpec(Builder.FENDER, "NEW1000", Type.ELECTRIC, Style.A, Wood.BRAZILLIAN_ROSEWOOD, Wood.BRAZILLIAN_ROSEWOOD));
		mandolinInventory.addInstrument("MO12346", 21000, new MandolinSpec(Builder.FENDER, "NEW1001", Type.ELECTRIC, Style.F, Wood.INDIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD));
		mandolinInventory.addInstrument("MO12347", 19000, new MandolinSpec(Builder.FENDER, "NEW102", Type.ELECTRIC, Style.F, Wood.INDIAN_ROSEWOOD, Wood.BRAZILLIAN_ROSEWOOD));
		mandolinInventory.addInstrument("MO12348", 9000, new MandolinSpec(Builder.FENDER, "NEW1003", Type.ELECTRIC, Style.A, Wood.INDIAN_ROSEWOOD, Wood.BRAZILLIAN_ROSEWOOD));

		MandolinSpec whichMandolinErinLikes = new MandolinSpec(Builder.FENDER, "NEW1001", Type.ELECTRIC, Style.F, Wood.INDIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
		GuitarSpec whichGuitarErinLikes = new GuitarSpec(Builder.FENDER, "NEW104", Type.ELECTRIC, 12, Wood.BRAZILLIAN_ROSEWOOD, Wood.BRAZILLIAN_ROSEWOOD);

		List<Guitar> guitarLst = guitarInventory.search(whichGuitarErinLikes);
		List<Mandolin> mandolinLst = mandolinInventory.search(whichMandolinErinLikes);

		for(Mandolin mandolin: mandolinLst) {
			printDetails(mandolin);
		}
		
		for(Guitar guitar: guitarLst) {
			printDetails(guitar);
		}
	}
	
	public static void printDetails(Instrument instrument) {
		System.out.print("Serial number: "+instrument.getSerialNumber()+",");
		System.out.println("\tPrice: "+instrument.getPrice());
	}
}
