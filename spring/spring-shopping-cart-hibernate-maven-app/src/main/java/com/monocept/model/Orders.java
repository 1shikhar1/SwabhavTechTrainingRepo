package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Orders {
	@Id
	private int id;
	private String date;
	
	@OneToMany(mappedBy="order",cascade = CascadeType.ALL)
	private List<LineItem> items;
	
	@ManyToOne
	@JoinColumn
	private Customer customer;
		
	public Orders(int id, String date) {
		this.id = id;
		this.date = date;
		this.items = new ArrayList<LineItem>();
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void addItem(LineItem item) {
		items.add(item);
	}
	
	public int getId() {
		return id;
	}
	
	public String getDate() {
		return date;
	}
	
	public int getItemsCount() {
		return items.size();
	}
	
	public List<LineItem> getItems(){
		return items;
	}

}
