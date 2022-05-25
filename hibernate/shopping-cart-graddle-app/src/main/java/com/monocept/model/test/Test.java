package com.monocept.model.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Customer;
import com.monocept.model.Orders;

public class Test {
	public static void main(String args[]) {
		Customer c1 = new Customer(1,"Rohan");
		
		Orders o1 = new Orders(10,"05/25/2022");
		Orders o2 = new Orders(13,"05/25/2022");
		Orders o3 = new Orders(14,"05/25/2022");
		
		c1.addOrder(o1);
		c1.addOrder(o2);
		c1.addOrder(o3);
		
		
	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory facotry = cfg.configure().buildSessionFactory();
	    Session session = facotry.openSession();

	    Transaction txn = session.beginTransaction();
	    
	    
	    try {
		      session.save(c1);
		
		      txn.commit();
		    } catch (Exception e) {
		      System.out.println("error: "+e);
		      txn.rollback();
		    } finally {
		      if (session.isOpen())
		        session.close();
		    }
	}
}
