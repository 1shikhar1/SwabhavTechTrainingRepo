package com.monocept.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.Student;
import com.monocept.model.dto.StudentDto;
import com.monocept.repository.StudentRepository;

@Service("studentSvc")
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public StudentService() {
		System.out.println("Inside student service");
	}
	
	public List<StudentDto> getAll(){
		return repo.get().stream().map(s->new StudentDto(s.getRollNo(),s.getName())).collect(Collectors.toList());
	}
	
	
	public void addStudent(Student std) {
		repo.addStudent(std);
	}

	public void deleteStudent(int rollNo) {
		repo.deleteStudent(rollNo);
	}
	
	public void editStudent(Student student) {
		repo.editStudent(student);
	}
	
}
