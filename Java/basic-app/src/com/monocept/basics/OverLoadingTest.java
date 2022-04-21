package com.monocept.basics;

public class OverLoadingTest {

	public static void main(String args[]) {
		printinfo("Shikhar");
		printinfo(34.f);
		printinfo(87>90);
		printinfo(876);
		printinfo('h');
		printinfo(876.55544);
	}
		
	static void printinfo(String str) {
		System.out.println(str);
		
	}
	static void printinfo(int num) {
		System.out.println(num);
	}
	static void printinfo(float num) {
		System.out.println(num);
	}
	static void printinfo(char ch) {
		System.out.println(ch);
	}
	static void printinfo(Double num) {
		System.out.println(num);
	}
	static void printinfo(boolean val) {
		System.out.println(val);
	
}
}