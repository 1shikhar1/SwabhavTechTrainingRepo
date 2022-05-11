package com.monocept.model;

public class Student {
	private int rollNo;
	private String firstName;
	private String lastName;
	private double cgpa;
	
	public Student(int rollNo, String firstName, String lastName, double cgpa) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cgpa = cgpa;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public double getCgpa() {
		return cgpa;
	}
}
