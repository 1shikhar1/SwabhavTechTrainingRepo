package com.monocept.model.test;

import java.util.*;

import com.monocept.model.Student;

public class StudentTest {
	public static void main(String args[]) {
		List<Student> studentList;
		studentList = new ArrayList<Student>();
		
		studentList.add(new Student(101,"Rohan","b",10,7.5));
		studentList.add(new Student(101,"Rohan","b",10,7.5));
		printDetails(studentList);
		
		System.out.println();
		
		Set<Student> studentSet;
		studentSet = new TreeSet<Student>();
		
		studentSet.add(new Student(103,"Ramya","b",10,8.5));
		studentSet.add(new Student(102,"Ramya","b",10,7.5));
		studentSet.add(new Student(102,"Ramya","b",12,3.5));
		
		studentSet.add(new Student(102,"rRamya","b",10,3.5));
		printDetails(studentSet);
	}
	
	public static void printDetails(Iterable<Student> students) {
		for(Student student: students) {
			System.out.print("Roll No: "+student.getRollNo());
			System.out.print("\tFirst_name: "+student.getFirstName());
			System.out.print("\tLast_name: "+student.getLastName());
			System.out.print("\tStandard: "+student.getStandard());
			System.out.print("\tCGPA: "+student.getCgpa());
			System.out.println();
		}
	}
}
