package com.monocept.model.dto;

public class StudentDto {
	private int rollNo;
	private String name;
	
	public StudentDto(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}
	
}
