package com.monocept.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.monocept.service.StudentService;

public class StudentTest {	
	public static void main(String args[]) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService sv1 = (StudentService) cxt.getBean("studentSvc");
		System.out.println(sv1.count());
		System.out.println(sv1.hashCode());
		
		StudentService sv2 = (StudentService) cxt.getBean("studentSvc");
		System.out.println(sv2.count());
		System.out.println(sv2.hashCode());
		
		System.out.println(sv1 == sv2);
		System.out.println(sv1.equals(sv2));
		
		System.out.println("End of the main");
	}
}
