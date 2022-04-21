package com.monocept.basics;

public class ClassLoaderTest {
	public static void main(String []args) {
		System.out.println("Displaying class loader information");
		System.out.println(OverLoadingTest.class.getClassLoader());
		System.out.println(args.getClass().getClassLoader());
		System.out.println(System.class.getClassLoader());
		System.out.println(String.class.getClassLoader());
	}
}
