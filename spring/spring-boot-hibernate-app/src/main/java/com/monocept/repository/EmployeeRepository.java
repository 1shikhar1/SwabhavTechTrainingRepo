package com.monocept.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.Department;
import com.monocept.model.Employee;

@Repository
public class EmployeeRepository {
	@PersistenceContext
	private EntityManager em;
	
	public Employee getById(int id) {
		return (Employee) em.createQuery("from Employee where id = " + id + " ").getSingleResult();
	}
	
	public List<Employee> get(){
		return em.createQuery("From Employee").getResultList();
	}
	
	@Transactional
	public void addEmployee(Employee emp) {
		em.persist(emp);
	}
	
	@Transactional
	public void deleteEmployee(int id) {
		Employee employee = (Employee) em.createQuery("from Employee where id = " + id + " ").getSingleResult();
		em.remove(employee);
	}
	
	@Transactional
	public void editEmployee(Employee newEmployee) {
		Employee employee = (Employee) em.createQuery("from Student where roll_no = " + newEmployee.getId() + " ").getSingleResult();
		employee.setName(newEmployee.getName());
		employee.setDepartment(newEmployee.getDepartment());
	    em.merge(employee);

	  }

}
