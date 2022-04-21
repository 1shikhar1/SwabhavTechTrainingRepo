package com.monocept.model;

public class Manager extends Employee {
	private double hra; // 50% of basic
	private double ta; // 30% of basic
	private double da; // 10% of basic

	public Manager(int eNumber, String name, double basic) {
		super(eNumber, name, basic);
	}

	private double getHRA() {
		return (getEBasic() * 50) / 100;
	}

	private double getTA() {
		return (getEBasic() * 30) / 100;
	}

	private double getDA() {
		return (getEBasic() * 10) / 100;
	}

	@Override
	public double calcAnnualCTC() {
		return getEBasic() + getHRA() + getTA() + getDA();
	}
	
	@Override
	public String getSalarySlip() {

		String SalarySlip = "";
		SalarySlip = SalarySlip + "Employee No: " + getENumber() + "\n";
		SalarySlip = SalarySlip + "Employee Name: " + getEName() + "\n";
		SalarySlip = SalarySlip + "Position: " + "Manager" + "\n";
		SalarySlip = SalarySlip + "Basic: " + getEBasic() + "\n";
		SalarySlip = SalarySlip + "HRA: " + getHRA() + "\n";
		SalarySlip = SalarySlip + "TA: " + getTA() + "\n";
		SalarySlip = SalarySlip + "DA: " + getDA() + "\n";
		SalarySlip = SalarySlip + "Total CTC: " + calcAnnualCTC() + "\n";

		return SalarySlip;
	}
}
