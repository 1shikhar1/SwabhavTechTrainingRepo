package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	@ManyToOne()
	@JoinColumn(name="dept_id")
	private Department dept;
	
	public Employee() {
		
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setDepartment(Department dept) {
		this.dept = dept;
	}
	
	public Department getDepartment() {
		return dept;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
}
