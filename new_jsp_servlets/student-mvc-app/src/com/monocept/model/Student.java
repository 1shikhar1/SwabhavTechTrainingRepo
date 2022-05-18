package com.monocept.model;

import java.util.List;
import java.util.Map;

public class Student {
	private int rollNo;
	private String firstName;
	private String lastName;
	private double cgpa;
	private Map<Courses,Integer> courses;
	
	public Student(int rollNo, String firstName, String lastName, double cgpa, Map<Courses,Integer> courses) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.courses = courses;
	}
	
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
	
	public Map<Courses,Integer> getCourses(){
		return courses;
	}
}
