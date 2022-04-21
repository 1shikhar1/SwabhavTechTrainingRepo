package com.monocept.streams.test;

import java.util.Arrays;

public class ArrayStreamsTest {
	public static void main(String args[]) {
		
		String names[] = {"Vishak","Marry","Aditi"};
		
		Arrays.stream(names).forEach(ArrayStreamsTest::printDetails);
		System.out.println();
		
		Arrays.stream(names).forEach(n->System.out.println(n));
		System.out.println();
		
		Arrays.stream(names).forEach(System.out::println);
	}
	
	static void printDetails(String name) {
		System.out.println(name);
	}
	
	static void foo() {
		
	}
}
