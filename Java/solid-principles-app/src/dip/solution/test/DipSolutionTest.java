package dip.solution.test;

import dip.solution.*;

public class DipSolutionTest {
public static void main(String args[]) {
		
		TaxCalculator calculator = new TaxCalculator(new FileLogger());
		
		System.out.println(calculator.calculateTax(12, 4));
		
		System.out.println(calculator.calculateTax(17, 0));
		
		System.out.println(calculator.calculateTax(16, 3));
		
		ILogger logger= (String err)-> System.out.println("Error logged in somewhere else: "+err);
		
		calculator = new TaxCalculator(logger);
		
		System.out.println(calculator.calculateTax(21, 0));
	}
}
