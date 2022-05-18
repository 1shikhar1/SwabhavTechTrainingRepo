package com.monocept.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.monocept.model.Student;

@Repository
public class StudentRepository {
	public StudentRepository() {
		System.out.println("Inside student repository");
	}
	
	public List<Student> get(){
		List<Student> students = new ArrayList<>();
		students.add(new Student(101,"Rohan"));
		students.add(new Student(102,"Vineet"));
		students.add(new Student(103,"Ramya"));
		students.add(new Student(104,"Shikhar"));
		return students;
	}
}
