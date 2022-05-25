package com.monocept.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class LineItem {
	@Id
	private int id;
	private int quantity;
	
	@OneToOne(mappedBy="lineItem",cascade = CascadeType.ALL)
	private Product product;
	
	@ManyToOne
	@JoinColumn
	private Orders order;
	
	public LineItem(int id, int quantity) {
		this.id = id;
		this.quantity = quantity;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	
	public int getId() {
		return id;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public Orders getOrder() {
		return order;
	}
	
}
