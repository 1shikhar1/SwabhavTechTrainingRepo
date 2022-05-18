package com.monocept.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.monocept.model.Courses;
import com.monocept.model.Student;

public class StudentService {
	private static StudentService instance = null;
	
	private List<Student> students;
	
	private StudentService() {
		
		System.out.println("Inside student service");
		students = new ArrayList<Student>();
		
//		Map<Courses,Integer> courses1 = new HashMap<>();
//		courses1.put(Courses.JAVA,75);
//		courses1.put(Courses.PYTHON, 67);
//		courses1.put(Courses.ANGULAR, 37);
//		courses1.put(Courses.ML, 87);
//		students.add(new Student(101,"Shikhar","Patel",8.5,courses1));
//		
//		Map<Courses,Integer> courses2 = new HashMap<>();
//		courses2.put(Courses.C,37);
//		courses2.put(Courses.JAVASCRIPT, 67);
//		courses2.put(Courses.ALGORITHM, 45);
//		courses2.put(Courses.ML, 87);
//		students.add(new Student(102,"Rohan","Sahu",9.5,courses2));
//		
//		Map<Courses,Integer> courses3 = new HashMap<>();
//		courses3.put(Courses.JAVA,75);
//		courses3.put(Courses.C, 37);
//		courses3.put(Courses.ALGORITHM, 45);
//		courses3.put(Courses.PYTHON, 67);
//		students.add(new Student(103,"Rahul","Dixit",7.0,courses3));
//		
//		Map<Courses,Integer> courses4 = new HashMap<>();
//		courses4.put(Courses.ANGULAR,75);
//		courses4.put(Courses.C, 37);
//		courses4.put(Courses.ALGORITHM, 45);
//		courses4.put(Courses.ML, 87);
//		students.add(new Student(104,"Saurabh","Singh",8.9,courses4));
//		
//		Map<Courses,Integer> courses5 = new HashMap<>();
//		courses5.put(Courses.JAVA,75);
//		courses5.put(Courses.C, 37);
//		courses5.put(Courses.ALGORITHM, 45);
//		courses5.put(Courses.JAVASCRIPT, 67);
//		students.add(new Student(105,"Gaurav","Aggrawal",6.4,courses5));
		
		
		
		students.add(new Student(101,"Shikhar","Patel",8.9));
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
