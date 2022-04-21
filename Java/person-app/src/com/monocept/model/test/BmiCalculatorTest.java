package com.monocept.model.test;

import com.monocept.model.BmiCalculator;
import com.monocept.model.GenderOptions;
import com.monocept.model.Person;

public class BmiCalculatorTest {
	public static void main(String args[]) {
		Person first = new Person("Asha", 29, 5.8f, 62.5f, GenderOptions.FEMALE);
		
		BmiCalculator bmiScore = new BmiCalculator(first);
		
		System.out.println("Person Details: "+bmiScore.getDetails());
		System.out.println("BMI Score: "+bmiScore.getBmiScore());
		System.out.println("Body Category: "+bmiScore.getBodyCategory());
		
	}
}
