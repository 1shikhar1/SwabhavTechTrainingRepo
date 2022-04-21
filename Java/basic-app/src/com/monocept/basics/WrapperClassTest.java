package com.monocept.basics;
import java.util.*;

public class WrapperClassTest {
	
	public static void main(String args[]) {
		
		Integer I=new Integer(25);
		int num = 23;
		
		ArrayList<Integer> lst = new ArrayList<>();
		
		lst.add(num); // it was not working till java 1.4, Because ArrayList is expecting Integer Object but we are passing int
		// but from java 1.5 onwards it is working perfectly, Because Auto boxing performed on int type variable
		// Auto boxing converts int type variable into Integer wrapper object.
		
		
		int tmp = I; // it was not working till java 1.4, Because tmp is expecting int type value but we are passing object
		// but from java 1.5 onwards it is working perfectly, Because unboxing performed on Integer object
		// unboxing converts Integer object into int  
	}
}
