package com.monocept.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {
	@Id
	private int id;
	private String name;
	private double balance;
	@OneToMany(mappedBy="acc",cascade = CascadeType.ALL)
	private Set<Transection> transactions;
	
	public Account() {
		
	}
	
	public Account(int id, String name, double balance) {
		this.name = name;
		this.balance = balance;
		transactions = new HashSet<Transection>();
	}
	
	public int id() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Set<Transection> getTransaction(){
		return transactions;
	}
	
	public void setTransaction(HashSet<Transection> transactions) {
		this.transactions = transactions;
	}
			
}
