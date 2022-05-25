package com.monocept.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.Student;

@Repository
public class StudentRepository {
	@PersistenceContext
	private EntityManager em;
	
	public StudentRepository() {
		System.out.println("Inside student repository");

	}
	
	public List<Student> get(){
		return em.createQuery("From Student").getResultList();
	}

	@Transactional
	public void addStudent(Student std) {
		em.persist(std);
	}

	  @Transactional
	  public void deleteStudent(int rollNo) {
	    Student student = (Student) em.createQuery("from Student where roll_no = " + rollNo + " ").getSingleResult();
	    em.remove(student);
	    
	  }
	  
	  
	  @Transactional
	  public void editStudent(Student newStudent) {
	    Student student = (Student) em.createQuery("from Student where roll_no = " + newStudent.getRollNo() + " ").getSingleResult();
	    student.setName(newStudent.getName());
	    em.merge(student);

	  }
	

	


}
