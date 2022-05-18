package com.monocept.model.test2;

import java.util.HashSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Account;
import com.monocept.model.Transection;

public class AccountTest {
	public static void main(String args[]) {
		add();
//		displayAll();
	}
	
	public static void add() {
		Account acc1 = new Account(10,"Vineet",85000);
		
		Transection t1 = new Transection(101,2000,"Withdraw");
		t1.setAccount(acc1);
		Transection t2 = new Transection(102,3300,"Deposite");
		t2.setAccount(acc1);
		Transection t3 = new Transection(103,2800,"Deposite");
		t3.setAccount(acc1);
		Transection t4 = new Transection(104,7400,"Withdraw");
		t4.setAccount(acc1);
		
		HashSet<Transection> transactions = new HashSet<>();
		
		transactions.add(t1);
		transactions.add(t2);
		transactions.add(t3);
		transactions.add(t4);
		
		acc1.setTransaction(transactions);
		
	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory facotry = cfg.configure().buildSessionFactory();
	    Session session = facotry.openSession();

	    Transaction txn = session.beginTransaction();
	    
	    try {
		      session.save(acc1);
		      txn.commit();
		    } catch (Exception e) {
		      System.out.println("error: "+e);
		      txn.rollback();
		    } finally {
		      if (session.isOpen())
		        session.close();
		    }
	}
	
	public static void displayAll() {
	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory facotry = cfg.configure().buildSessionFactory();
	    Session session = facotry.openSession();

	    List<Transection> transections = null;
	    
	    transections = session.createQuery("FROM Transection").list();
	
	    System.out.println("id\t|\tname");
	      for (Transection txn : transections) {
	    	  System.out.println(txn.getId()+"\t|\t"+txn.getAmount()+"\t|\t"+txn.getType());
	      }
	}
}
