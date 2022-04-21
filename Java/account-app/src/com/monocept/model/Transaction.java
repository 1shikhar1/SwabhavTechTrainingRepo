package com.monocept.model;

import java.time.Instant;

public class Transaction {
	private Instant id;
	private String type;
	private double amount;
	
	public Transaction(Instant id, String type, double amount) {
		this.id = id;
		this.type = type;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		String result = "";
		result = result + "id: "+id+"\t";
		result = result + "type: "+type+"\t";
		result = result + "amount: "+amount+"\t";
		
		return result;
	}
}
