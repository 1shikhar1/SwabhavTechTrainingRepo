package com.monocept.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.repository.StudentRepository;

@Service("studentSvc")
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public StudentService() {
		System.out.println("Inside student service");
	}
	
	public int count() {
		return repo.get().size();
	}
}
