package com.monocept.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.monocept.model.Student;

@Repository
public class StudentRepository {
	private List<Student> students;
	
	public StudentRepository() {
		System.out.println("Inside student repository");
		students = new ArrayList<>();
		students.add(new Student(101,"Rohan"));
		students.add(new Student(102,"Vineet"));
		students.add(new Student(103,"Ramya"));
		students.add(new Student(104,"Shikhar"));
	}
	
	public List<Student> getAll(){
		return students;
	}
	
	public Student getSingle(int roll) {
		Student student = null;
		for(Student std: students) {
			if(std.getRollNo()==roll) {
				student = std;
			}
		}
		
		return student;
	}
	
	public void addStudent(Student std) {
		students.add(std);
	}
	
	public void updateStudent(int roll, Student std) {
		for(Student stdnts : students) {
			if(stdnts.getRollNo()==roll) {
				stdnts.setName(std.getName());
			}
		}
	}
}
