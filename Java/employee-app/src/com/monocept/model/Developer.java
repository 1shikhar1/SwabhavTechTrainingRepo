package com.monocept.model;

public class Developer extends Employee {
	private double pib; // 40% of basic
	private double otb; // 30% of basic

	public Developer(int eNumber, String eName, double basic) {
		super(eNumber, eName, basic);
	}

	private double getPIB() {
		return (getEBasic() * 40) / 100;
	}

	private double getOTB() {
		return (getEBasic() * 30) / 100;
	}

	@Override
	public double calcAnnualCTC() {
		return getEBasic() + getPIB() + getOTB();
	}

	@Override
	public String getSalarySlip() {

		String SalarySlip = "";
		SalarySlip = SalarySlip + "Employee No: " + getENumber() + "\n";
		SalarySlip = SalarySlip + "Employee Name: " + getEName() + "\n";
		SalarySlip = SalarySlip + "Position: " + "Developer" + "\n";
		SalarySlip = SalarySlip + "Basic: " + getEBasic() + "\n";
		SalarySlip = SalarySlip + "PIB: " + getPIB() + "\n";
		SalarySlip = SalarySlip + "OTB: " + getOTB() + "\n";
		SalarySlip = SalarySlip + "Total CTC: " + calcAnnualCTC() + "\n";

		return SalarySlip;
	}
}
