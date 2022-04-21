package com.monocept.model.test;
import java.util.function.IntFunction;

import com.monocept.model.*;

public class MathOperationTest {
	public static void main(String args[]) {
	
		
		
		IntFunction y;
		y = (n)-> n%2==0?true:false;
		
		System.out.println(y.apply(10));
		
		IntFunction z;
		z = MathOperationTest::checkEven;
		System.out.println(z.apply(10));
		
	}
	
	public static double divideOperation(int a, int b) {
		return a/b;
	}
	
	public static int cubeAnEvenNo(int n) {
		if(n%2==0)
			return n*n*n;
		return n;
	}
	
	public static boolean checkEven(int n) {
		return (n%2==0)?true:false;
	}
}
