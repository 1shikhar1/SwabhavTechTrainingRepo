package com.monocept.model.test;

import java.io.IOException;

import com.monocept.model.ReadWritePropertyFile;

public class ReadPropertyFileTest {
	public static void main(String args[]) throws IOException {
		ReadWritePropertyFile obj = new ReadWritePropertyFile(); 
		obj.writeProperty("Rohan", "Male", "Banglore");
		
		System.out.println("\n"+obj.readPropertyFile());
		System.out.println("\nProperties read successfully");
	}
}
