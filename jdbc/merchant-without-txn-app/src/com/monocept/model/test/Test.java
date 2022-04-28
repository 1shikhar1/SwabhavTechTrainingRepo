package com.monocept.model.test;

import java.sql.SQLException;

import com.monocept.model.Transaction;

public class Test {
	public static void main(String args[]) throws SQLException {
		 Transaction tr = new  Transaction();
		 
		 System.out.println("Merchant balance: "+tr.getMerchantDetails("M1"));
		 System.out.println("Customer balance: "+tr.getCustomerDetails("C1"));
		 
		 tr.doTransaction("M1", "C4351", 10000);
		 
		 System.out.println("\nBalance after transaction: \n");
		 
		 System.out.println("Merchant balance: "+tr.getMerchantDetails("M1"));
		 System.out.println("Customer balance: "+tr.getCustomerDetails("C1"));
	}
}
