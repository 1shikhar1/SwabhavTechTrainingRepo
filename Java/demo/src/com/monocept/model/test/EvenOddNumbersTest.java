package com.monocept.model.test;

import com.monocept.model.EvenOddNumbers;

public class EvenOddNumbersTest {
	public static void main(String args[]) {

		EvenOddNumbers numbers = new EvenOddNumbers();

		System.out.println("Even numbers: ");
		numbers.evenNumbers();
		System.out.println("\nOdd numbers: ");
		numbers.oddNumbers();
	}
}