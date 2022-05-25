package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.monocept.repository.StudentRepository;

@Entity
public class Student {
	@Id
	private int rollNo;
	private String name;
	
	public Student() {
		
	}
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRoll(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
