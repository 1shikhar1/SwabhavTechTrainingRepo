package com.monocept.model;

public class LineItem implements Comparable<LineItem>{
	private int id;
	private String name;
	private int quantity;
	private double unitPrice;
	
	public LineItem(int id, String name, int quantity, double unitPrice) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public double calculateCost() {
		return quantity*unitPrice;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getunitPrice() {
		return unitPrice;
	}
	
	@Override
	public boolean equals(Object obj) {
		LineItem s = (LineItem) obj;
		Integer id1 = id;
		Integer id2 = s.id;
		return id1.equals(id2) && name.equalsIgnoreCase(s.name);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public int compareTo(LineItem obj) {
		return  name.compareTo(obj.name);
	}
}
