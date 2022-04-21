package com.monocept.model;

public class Professor extends Person implements SalariedPerson{
	private double basic;
	private double hra; // 50% of basic
	private double ta; // 30% of basic
	private double da; // 10% of basic

	public Professor(int id, String name, String address, String dob, double basic) {
		super(id, name, address, dob);
		this.basic = basic;
	}

	private double getBasic() {
		return basic;
	}

	private double getHRA() {
		return (getBasic() * 50) / 100;
	}

	private double getTA() {
		return (getBasic() * 30) / 100;
	}

	private double getDA() {
		return (getBasic() * 10) / 100;
	}

	public double calcAnnualCTC() {
		return getBasic() + getHRA() + getTA() + getDA();
	}

	@Override
	public String getSalarySlip() {
		String salarySlip = "";
		salarySlip = salarySlip + "Basic: "+basic+"\n";
		salarySlip = salarySlip + "HRA: "+getHRA()+"\n";
		salarySlip = salarySlip + "TA: "+getTA()+"\n";
		salarySlip = salarySlip + "DA: "+getTA()+"\n";
		salarySlip = salarySlip + "Annual Salary: "+calcAnnualCTC()+"\n";
		
		return salarySlip;
	}
}
