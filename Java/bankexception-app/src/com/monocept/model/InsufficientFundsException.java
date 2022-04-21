package com.monocept.model;

public class InsufficientFundsException extends RuntimeException {
	
	Account acc;
	 public InsufficientFundsException(Account acc){
//		 super("Account holder "+acc.getAccountNo() +" named ("+acc.getName()+") tries to withra money but he has only "+acc.getBalance()+". "+ "Insufficient funds to withdraw as bank policy is to maintain min balance 500.");
		 	 this.acc = acc;
	 }
	 
	 @Override
	 public String getMessage() {
	        return "Account holder "+acc.getAccountNo() +" named ("+acc.getName()+") tries to withra money but he has only "+acc.getBalance()+". "+ "Insufficient funds to withdraw as bank policy is to maintain min balance 500.";
 }
}
