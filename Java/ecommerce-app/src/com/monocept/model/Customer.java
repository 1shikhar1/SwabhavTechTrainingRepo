package com.monocept.model;

import java.util.*;

public class Customer {
	private int id;
	private String name;
	private List<Order> orders;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.orders = new ArrayList<Order>();
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	public int getOrderCount() {
		return orders.size();
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	@Override
	public String toString() {
		String str = "";
		str = str + "Customer Id: "+id+"\tCustomer Name: "+name+"\tOrder counts: "+orders.size();
		str = str + "\n";
		
//		if(orders.size()!=0)
//		for(Order order: orders) {
//			str = str + order;
//		}
		return str;
	}
}
