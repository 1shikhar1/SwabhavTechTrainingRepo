package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transection {
	@Id
	private int id;
	private double amount;
	private String type;
	@ManyToOne()
	@JoinColumn(name="account_id")
	private Account acc;
	
	public Transection() {
		
	}
	
	public Transection(int id, double amount, String type) {
		this.id = id;
		this.amount = amount;
		this.type =type;
	}
	
	public int getId() {
		return id;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAccount(Account acc) {
		this.acc = acc;
	}
	
	public String getType() {
		return type;
	}
	
	public Account getAccount() {
		return acc;
	}
	
}
