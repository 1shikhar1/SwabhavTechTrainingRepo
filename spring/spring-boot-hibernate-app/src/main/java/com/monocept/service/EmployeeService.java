package com.monocept.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.Department;
import com.monocept.model.Employee;
import com.monocept.model.Student;
import com.monocept.model.dto.DepartmentDto;
import com.monocept.model.dto.EmployeeDto;
import com.monocept.repository.EmployeeRepository;

@Service("employeeSvc")
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public EmployeeDto getById(int id) {
		Employee emp = repo.getById(id);
		return new EmployeeDto(emp.getId(),emp.getName(),emp.getSalary(),emp.getDepartment().getName());
	}
	
	public List<EmployeeDto> getAll(){
		
		return repo.get().stream()
		.map(e->new EmployeeDto(e.getId(),e.getName(),e.getSalary(),e.getDepartment().getName()))
		.collect(Collectors.toList());
	}
	
	
	public void addEmployee(Employee emp) {
		repo.addEmployee(emp);
	}

	public void deleteEmployee(int id) {
		repo.deleteEmployee(id);
	}
	
	public void editEmployee(Employee employee) {
		repo.editEmployee(employee);
	}
}
