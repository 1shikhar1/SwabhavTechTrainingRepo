package com.monocept.model.test;

public class CustomExceptionTest {
	private int salary;

	public static void main(String args[]) throws SalaryNotAllowed {
		CustomExceptionTest obj = new CustomExceptionTest();
		
		obj.setSalary(8000);
	}

	public void setSalary(int salary) throws SalaryNotAllowed {
		if (salary < 10000)
			throw new SalaryNotAllowed("Minimum salary shoud be atleast 10000");
		this.salary = salary;
		System.out.println("Salary initialized successfully. \nSalary= "+this.salary);
	}
}

class SalaryNotAllowed extends Exception {
	public SalaryNotAllowed(String s) {
		super(s);
	}
}
