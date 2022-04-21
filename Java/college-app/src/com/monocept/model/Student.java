package com.monocept.model;

public class Student extends Person {
	private final String branch;
	
	public Student(int id, String name, String address, String dob, String branch) {
		super(id, name, address, dob);
		this.branch = branch;
	}
	
	public String getBranch() {
		return branch;
	}
}
