package com.monocept.model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy="customer",cascade = CascadeType.ALL)
	private List<Orders> orders;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.orders = new ArrayList<Orders>();
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void addOrder(Orders order) {
		orders.add(order);
	}
	
	public int getOrderCount() {
		return orders.size();
	}
	
	public List<Orders> getOrders() {
		return orders;
	}
	
	@Override
	public String toString() {
		String str = "";
		str = str + "Customer Id: "+id+"\tCustomer Name: "+name+"\tOrder counts: "+orders.size();
		str = str + "\n";
		
		return str;
	}
}
