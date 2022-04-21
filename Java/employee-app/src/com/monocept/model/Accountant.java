package com.monocept.model;

public class Accountant extends Employee {
	private double perks; // 30% of basic

	public Accountant(int eNumber, String eName, double basic) {
		super(eNumber, eName, basic);
	}

	private double getPerks() {
		return (getEBasic() * 30) / 100;
	}

	@Override
	public double calcAnnualCTC() {
		return getEBasic() + getPerks();
	}

	@Override
	public String getSalarySlip() {

		String SalarySlip = "";
		SalarySlip = SalarySlip + "Employee No: " + getENumber() + "\n";
		SalarySlip = SalarySlip + "Employee Name: " + getEName() + "\n";
		SalarySlip = SalarySlip + "Position: " + "Accountant" + "\n";
		SalarySlip = SalarySlip + "Basic: " + getEBasic() + "\n";
		SalarySlip = SalarySlip + "Perks: " + getPerks() + "\n";
		SalarySlip = SalarySlip + "Total CTC: " + calcAnnualCTC() + "\n";

		return SalarySlip;
	}
}
