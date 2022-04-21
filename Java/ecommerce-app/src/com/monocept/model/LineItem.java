package com.monocept.model;

public class LineItem {
	private int id;
	private int quantity;
	Product product;
	
	public LineItem(int id, int quantity, Product product) {
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}
	
	public int getId() {
		return id;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public double getItemCost() {
		return product.getPrice()*quantity;
	}
	
	public double getItemCostAfterDiscount() {
		return product.getPriceAfterDiscount()*quantity;
	}
	
	@Override
	public String toString() {
		String str = "";
		str = str + "\nItem Id:"+id+"\tQuantity:"+quantity+"\tProduct:- \n"+product;
		return str;
	}
}
