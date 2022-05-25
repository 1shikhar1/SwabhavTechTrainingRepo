package com.monocept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.Student;
import com.monocept.repository.StudentRepository;

@Service("studentSvc")
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public StudentService() {
		System.out.println("Inside student service");
	}
	
	public List<Student> getAll(){
		return repo.getAll();
	}
	
	public Student getSingle(int roll){
		return repo.getSingle(roll);
	}
	
	public void addStudent(Student std) {
		repo.addStudent(std);
	}
	
	public void updateStudent(int roll, Student std) {
		repo.updateStudent(roll, std);
	}
}
