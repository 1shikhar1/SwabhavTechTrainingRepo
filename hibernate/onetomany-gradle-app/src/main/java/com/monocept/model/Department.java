package com.monocept.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy="dept",cascade = CascadeType.ALL)
	private Set<Employee> employees;
	
	public Department() {
		
	}
	
	public Department(int id, String name) {
		
		this.id = id;
		this.name = name;
		
		employees =new HashSet<Employee>();
	}
	
	public void setEmployees(HashSet<Employee> employees) {
		this.employees = employees;
	}
	
	public Set<Employee> getEmployees(){
		return employees;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
}
