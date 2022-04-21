package dip.violation.test;

import dip.violation.*;

public class DipViolationTest {
	public static void main(String args[]) {
		
		TaxCalculator calculator = new TaxCalculator(LogType.DB);
		
		System.out.println(calculator.calculateTax(12, 4));
		
		System.out.println(calculator.calculateTax(17, 0));
		
		System.out.println(calculator.calculateTax(16, 3));
	}
}
