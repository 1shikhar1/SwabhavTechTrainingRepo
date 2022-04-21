package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int id;
	private String date;
	private List<LineItem> items;
	
	public Order(int id, String date) {
		this.id = id;
		this.date = date;
		this.items = new ArrayList<LineItem>();
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
	
	public double checkoutPrice() {
		double totalPrice = 0;
		for(LineItem item: items) {
			totalPrice = totalPrice + item.getItemCost(); 
		}
		return totalPrice;
	}
	
	public double checkoutPriceAfterDiscount() {
		double totalPrice = 0;
		for(LineItem item: items) {
			totalPrice = totalPrice + item.getItemCostAfterDiscount();
		}
		return totalPrice;
	}
	
	@Override
	public String toString() {
		String str = "";
		str = str + "Order Id: "+id+"\t";
		str = str + "Order date:"+date+"\t";
		str = str + "Items count: :"+items.size()+"\n";
		str = str + "Items: \n";
		
//		if(items.size()!=0)
//		for(LineItem item: items) {
//			str = str + item;
//		}
			
		return str;
	}
}
