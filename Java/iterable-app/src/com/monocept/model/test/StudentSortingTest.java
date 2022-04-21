package com.monocept.model.test;

import java.util.*;

import com.monocept.model.Student;

public class StudentSortingTest {
	public static void main(String args[]) {


		Set<Student> studentSet;
		studentSet = new TreeSet<Student>(new SortByFirstName());
		
		studentSet.add(new Student(103,"Ramya","b",10,8.5));
		studentSet.add(new Student(103,"Vineet","b",10,8.5));
		studentSet.add(new Student(102,"Ramya","akkula",10,7.5));
		studentSet.add(new Student(102,"Abhishek","b",12,3.5));
		
		studentSet.add(new Student(101,"Rohan","b",10,3.5));
		
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

class SortByFirstName implements Comparator<Student>{
	public int compare(Student one, Student two) {
		return one.getFirstName().compareTo(two.getFirstName());
	}
}

class SortByLastName implements Comparator<Student>{
	public int compare(Student one, Student two) {
		return one.getLastName().compareTo(two.getLastName());
	}
}

class SortByCGPA implements Comparator<Student>{
	public int compare(Student one, Student two) {
		Double cgpa1 = one.getCgpa();
		Double cgpa2 = two.getCgpa();
		return cgpa1.compareTo(cgpa2);
	}
}

