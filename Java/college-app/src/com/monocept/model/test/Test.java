package com.monocept.model.test;

import com.monocept.model.Person;
import com.monocept.model.Professor;
import com.monocept.model.Student;

public class Test {
	public static void main(String args[]) {
		Student rohan = new Student(100,"Rohan","Kanpur","10/11/1996","CS");
		Student asha = new Student(101,"Asha","Hydrabad","21/05/1997","Civil");
		
		Professor abhishek = new Professor(1000, "Abhishek", "Delhi", "24/09/1995", 250000);
		
		printDetails(rohan);
		System.out.println();
		
		printDetails(asha);
		System.out.println();
		
		printDetails(abhishek);
	}
	
	static void printDetails(Person person) {
		System.out.println("Id: "+person.getId());
		System.out.println("Name: "+person.getName());
		System.out.println("Address: "+person.getAddress());
		System.out.println("DOB: "+person.getDob());
	}
	
	static void printDetails(Student student) {
		printDetails((Person)student);
		System.out.println("Branch: "+student.getBranch());
	}
	
	static void printDetails(Professor professor) {
		printDetails((Person)professor);
		System.out.println("Position: Manager");
		System.out.println(professor.getSalarySlip());
	}
	
}
