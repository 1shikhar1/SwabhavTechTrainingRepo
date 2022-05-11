package com.monocept.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.monocept.model.Student;

public class StudentService {
	private static StudentService instance = null;
	
	private List<Student> students;
	
	private StudentService() {
		
		System.out.println("Inside student service");
		
		students = new ArrayList<Student>();
		
		students.add(new Student(101,"Shikhar","Patel",8.5));
		students.add(new Student(102,"Rohan","Sahu",9.5));
		students.add(new Student(103,"Rahul","Dixit",7.0));
		students.add(new Student(104,"Saurabh","Singh",8.9));
		students.add(new Student(105,"Gaurav","Aggrawal",6.4));
	}
	
	public static StudentService getInstance() {
		if(instance==null)
			instance = new StudentService();
		
		return instance;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(int id) {
		
		Iterator itr = students.iterator();
		Student student = null;
		
		for(Student st: students) {
			if(st.getRollNo()==id) {
				student = st;
			}
		}
		students.remove(student);
	}
}
