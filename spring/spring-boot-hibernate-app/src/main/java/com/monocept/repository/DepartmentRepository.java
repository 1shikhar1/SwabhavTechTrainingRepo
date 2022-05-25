package com.monocept.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.Department;
import com.monocept.model.Student;

@Repository
public class DepartmentRepository {
	@PersistenceContext
	private EntityManager em;
	
	public Department getById(int id) {
		return (Department) em.createQuery("from Department where id = " + id + " ").getSingleResult();
	}
	
	public List<Department> get(){
		return em.createQuery("From Department").getResultList();
	}
	
	@Transactional
	public void addDepartment(Department dept) {
		em.persist(dept);
	}
	
	@Transactional
	public void deleteDepartment(int id) {
		Department department = (Department) em.createQuery("from Department where id = " + id + " ").getSingleResult();
	    em.remove(department);
	}
	
	@Transactional
	public void editDepartment(Department newDepartment) {
		Department department = (Department) em.createQuery("from Department where id = " + newDepartment.getId() + " ").getSingleResult();
		department.setName(newDepartment.getName());
	    em.merge(department);
	}
}
