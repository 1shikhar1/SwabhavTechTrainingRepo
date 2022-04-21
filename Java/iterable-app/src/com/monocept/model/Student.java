package com.monocept.model;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String firstName;
	private String lastName;
	private int standard;
	private double cgpa;
	
	public Student(int rollNo, String firstName, String lastName, int standard, double cgpa) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.standard = standard;
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
	
	public int getStandard() {
		return standard;
	}
	
	public double getCgpa() {
		return cgpa;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		Integer roll1 = rollNo;
		Integer roll2 = s.rollNo;
		return roll1.equals(roll2);
	}
	
	@Override
	public int hashCode() {
		Integer roll = (Integer)rollNo;
		return roll.hashCode();
	}

	@Override
	public int compareTo(Student o) {
		Integer roll1 = rollNo;
		Integer roll2 = o.getRollNo();
		return roll1.compareTo(roll2);
	}
}
