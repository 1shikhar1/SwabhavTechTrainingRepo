package com.monocept.model;

import java.util.Arrays;
import java.util.List;

public class WildcardTest2 {
	
	public static void main(String args[]) {
		
		List<String> names = Arrays.asList("Abhishek","Rohan","Vishal");
		printDetails(names);
		
		List<Integer> nos = Arrays.asList(10,20,30,40);
		printDetails(nos);
		
		List<?> someSpecficReadOnlyType = names;
		System.out.println(someSpecficReadOnlyType);
//		someSpecficReadOnlyType.add("Hello");
		
		someSpecficReadOnlyType = nos;
		System.out.println(someSpecficReadOnlyType);
	}
	
	static void printDetails(List<?> items ) {
		items.forEach(System.out::println);
	}
}
