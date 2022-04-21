package com.monocept.model.test;

import java.util.*;

import com.monocept.model.Student;

public class StudentHashMapTest {

	public static void main(String args[]) {
		HashMap<Student,Student> map = new HashMap<>();
		
		Student s1 = new Student(103,"Ramya","bbbbb",10,8.5);
		Student s2 = new Student(103,"Ramya","bbbbb",10,8.5);
		Student s3 = new Student(103,"Vineet","bbbbb",10,8.5);
		Student s4 = new Student(102,"Ramya","akkula",10,7.5);
		Student s5 = new Student(102,"Abhishek","bbbbb",12,3.5);
		Student s6 = new Student(101,"Rohan","bbbbb",10,3.5);
		
		map.put(s1,s4);
		map.put(s2,s4);
		map.put(s3,s4);
		map.put(s4,s5);
		map.put(s5,s6);
		map.put(s6,s4);
		
		for(Student std: map.keySet()) {
			printDetails(std);
//			printDetails(map.get(std));
		}
	}
	
	public static void printDetails(Student student) {
			System.out.print("Roll No: "+student.getRollNo());
			System.out.print("\tFirst_name: "+student.getFirstName());
			System.out.print("\tLast_name: "+student.getLastName());
			System.out.print("\tStandard: "+student.getStandard());
			System.out.print("\tCGPA: "+student.getCgpa());
			System.out.println();
	}
}
