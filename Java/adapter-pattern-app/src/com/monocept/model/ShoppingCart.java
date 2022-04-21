package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item itm) {
		items.add(itm);
	}
	
	public void removeItem(Item itm) {
		items.remove(itm);
	}
	
	public double getTotalPrice() {
		double total=0;
		for(Item itm : items) {
			total = total+itm.itemPrice();
		}
		return total;
	}
	
	public String getDetails() {
		String details = "";
		for(Item itm : items) {
			details += "name: "+itm.itemName()+" price: "+itm.itemPrice()+"\n";
		}
		
		details += "Total price: "+getTotalPrice();
		
		return details;
	}
}
