package com.monocept.model;

public class Customer {
	private final String id;
	private final String name;
	private String location;
	private double orderAmount;
	private static int counter;
	private static final int startIndex = 1000;
	
	static {
		counter = startIndex;
	}
	
	public Customer(String name, String location, double orderAmount) {
		id = "C"+(++counter);
		this.name = name;
		this.location = location;
		this.orderAmount = orderAmount;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}
}
