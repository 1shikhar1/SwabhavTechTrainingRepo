package com.monocept.model.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Student;

public class StudentTest {
	public static void main(String args[]) {
	    
	    addStudent(new Student(100,"rohan",9.4));
//	    addStudent(new Student(106,"azawed",8.5));
//	    getStudent(100);
	    
//	    deleteStudent(106);
//	    updateStudent();
//	    displayAll();
	}
	
	public static void getStudent(int id) {

	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory facotry = cfg.configure().buildSessionFactory();
	    Session session = facotry.openSession();

	    Transaction txn = session.beginTransaction();

	    Student student = null;
	    try {
	      student = (Student) session.get(Student.class, id);
	      txn.commit();
	    } catch (Exception e) {
	      System.out.println("error:"+ e);
	      txn.rollback();
	    } finally {
	      if (session.isOpen())
	        session.close();
	    }
	    
	    System.out.println(student.getId()+"\t|\t"+student.getName() + "\t|\t" + student.getCgpa());

	  }
	
	public static void addStudent(Student student) {

	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory facotry = cfg.configure().buildSessionFactory();
	    Session session = facotry.openSession();

	    Transaction txn = session.beginTransaction();

	    try {
	      session.save(student);
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

	    Transaction txn = session.beginTransaction();
	    
	    List<Student> students = null;
	    
	    try {
	      students = session.createQuery("FROM Student").list();
	      txn.commit();
	    } catch (Exception e) {
	      txn.rollback();
	    } finally {
	      if (session.isOpen())
	        session.close();
	    }

	      for (Student std : students) {
	    	  System.out.println(std.getId()+"\t|\t"+std.getName() + "\t|\t" + std.getCgpa());
	      }
	  }
	
	public static void deleteStudent(int id) {

	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory facotry = cfg.configure().buildSessionFactory();
	    Session session = facotry.openSession();

	    Transaction txn = session.beginTransaction();

	    try {
	      Student student = (Student) session.get(Student.class, id);
	      session.delete(student);
	      txn.commit();
	      System.out.println("student deleted");
	    } catch (Exception e) {
	      System.out.println("error: "+ e);
	      txn.rollback();
	    } finally {
	      if (session.isOpen())
	        session.close();
	    }

	  }
	
	public static void updateStudent() {

	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory facotry = cfg.configure().buildSessionFactory();
	    Session session = facotry.openSession();

	    Transaction txn = session.beginTransaction();
	    
	    Query q=session.createQuery("update Student set name=:n where id=:i");  
	    q.setParameter("n","zawed");  
	    q.setParameter("i",106);  

	    try {
	    	q.executeUpdate(); 
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
