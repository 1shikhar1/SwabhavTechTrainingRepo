package com.monocept.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.monocept.model.Courses;
import com.monocept.model.Student;
import com.monocept.repository.StudentRepository;

public class StudentService {
	private static StudentService instance = null;
	
	private List<Student> students;
	
	private StudentService() {
		
		System.out.println("Inside student service");
		students = new ArrayList<Student>();
	}
	
	public static StudentService getInstance() {
		if(instance==null)
			instance = new StudentService();
		
		return instance;
	}
	
	public List<Student> getStudents() {
		StudentRepository repo = StudentRepository.getInstance();
		
		try {
			students = repo.getStudents();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return students;
	}
	
	public List<Student> getStudents(int start, int end) {
		StudentRepository repo = StudentRepository.getInstance();
		
		try {
			students = repo.getStudents(start,end);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return students;
	}
	
	public void addStudent(Student student) {
		StudentRepository repo = StudentRepository.getInstance();
		
		try {
			repo.addStudent(student);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removeStudent(String rollNo) {
		StudentRepository repo = StudentRepository.getInstance();
		
		try {
			repo.removeStudent(rollNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Student getStudent(String rollNo) {
		StudentRepository repo = StudentRepository.getInstance();
		
		try {
			return repo.getStudent(rollNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
