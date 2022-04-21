package com.monocept.model.test;

import com.monocept.model.Customer;

public class CustomerTest {
	public static void main(String args[]) {
		Customer c1 = new Customer("Rohan", "Hydrabad", 5000);
		Customer c2 = new Customer("Ramya", "Banglore", 2000);
		Customer c3 = new Customer("Vineet", "Mumbai", 1000);
		
		printDetails(c1);
		System.out.println();
		printDetails(c2);
		System.out.println();
		printDetails(c3);
		System.out.println();
		printDetails(c1);
	}
	
	public static void printDetails(Customer customer) {
		System.out.print("Id: "+customer.getId()+", ");
		System.out.print("Name: "+customer.getName()+", ");
		System.out.print("Location: "+customer.getLocation()+", ");
		System.out.print("Order amount: "+customer.getOrderAmount()+" ");
	}
}
