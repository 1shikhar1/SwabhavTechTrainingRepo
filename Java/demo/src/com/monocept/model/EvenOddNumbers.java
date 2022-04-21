package com.monocept.model;

public class EvenOddNumbers {

	public void evenNumbers() {
		for (int i = 0; i <= 100; i += 2)
			System.out.print(i + " ");
	}

	public void oddNumbers() {
		for (int i = 1; i <= 100; i += 2)
			System.out.print(i + " ");
	}
}