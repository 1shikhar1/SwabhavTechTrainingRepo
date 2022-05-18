package com.monocept.model.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Department;
import com.monocept.model.Employee;

public class DepartmentTest {
	public static void main(String args[]) {
		displayAll();
	}
	
	public static void add() {
		Department dept10 = new Department(10,"Salse");
		Employee emp1 = new Employee(101,"Rohan");
		emp1.setDepartment(dept10);
		Employee emp2 = new Employee(102,"Nikhil");
		emp2.setDepartment(dept10);
		Employee emp3 = new Employee(103,"Vineet");
		emp3.setDepartment(dept10);
		
		HashSet<Employee> employees = new HashSet<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		dept10.setEmployees(employees);
		
		
	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory facotry = cfg.configure().buildSessionFactory();
	    Session session = facotry.openSession();

	    Transaction txn = session.beginTransaction();
	    
	    try {
		      session.save(dept10);
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

	    List<Employee> employees = null;
	    
	    employees = session.createQuery("FROM Employee").list();
	
	    System.out.println("id\t|\tname");
	      for (Employee emp : employees) {
	    	  System.out.println(emp.getId()+"\t|\t"+emp.getName());
	      }
	  }
	
}
