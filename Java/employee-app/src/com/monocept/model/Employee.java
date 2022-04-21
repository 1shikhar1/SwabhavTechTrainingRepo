package com.monocept.model;

public abstract class Employee {
	private final int eNumber;
	private final String eName;
	private double basic;

	public Employee(int eNumber, String eName, double basic) {
		this.eNumber = eNumber;
		this.eName = eName;
		this.basic = basic;
	}

	public int getENumber() {
		return eNumber;
	}

	public String getEName() {
		return eName;
	}

	public double getEBasic() {
		return basic;
	}

	public abstract double calcAnnualCTC();
	
	public abstract String getSalarySlip();
}
