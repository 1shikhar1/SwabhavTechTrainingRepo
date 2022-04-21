package com.monocept.model;

public abstract class Person {
	private final int id;
	private final String name;
	private String address;
	private final String dob;

	public Person(int id, String name, String address, String dob) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getDob() {
		return dob;
	}
}
