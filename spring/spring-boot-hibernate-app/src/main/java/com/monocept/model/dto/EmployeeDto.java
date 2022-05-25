package com.monocept.model.dto;

public class EmployeeDto {
	private int id;
	private String name;
	private double salary;
	private String departmentName;
	
	public EmployeeDto(int id, String name, double salary, String departmentName) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.departmentName = departmentName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartmentName() {
		return departmentName;
	}
	
}
