package com.monocept.model;

import java.util.*;

public class TypeErasure {
	public static void main(String args[]) {
		List<String> names = new ArrayList<String>();
		
		names.add("Abhishek");
		names.add("Rohan");
		
		List nos = names;
		
		nos.add(10);
		nos.add(20);
		nos.add(30);
		
		System.out.println(names);
		System.out.println(nos);
	}
}
