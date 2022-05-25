package com.monocept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.Employee;
import com.monocept.model.dto.EmployeeDto;
import com.monocept.service.EmployeeService;

@RequestMapping("/api/v1/employee")
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(path="/{id}")
	public ResponseEntity<EmployeeDto> getById(@PathVariable("id") int id){
		return ResponseEntity.ok(employeeService.getById(id));
	}
	
	@GetMapping(path="/all")
	public ResponseEntity<List<EmployeeDto>> getAll(){
		return ResponseEntity.ok(employeeService.getAll());
	}
	
	@PostMapping(path="/add",produces = "application/json")
	public ResponseEntity<Integer> addEmployee(@RequestBody Employee emp){
		employeeService.addEmployee(emp);
		return ResponseEntity.ok(emp.getId());
	}
	
	@DeleteMapping("/{id}")  
	public void deleteEmployee(@PathVariable("id") int id) {  
		employeeService.deleteEmployee(id);  
	}
	
	@PutMapping(path = "/edit")
	public ResponseEntity<Employee> editEmployee(@RequestBody Employee employee) {
		employeeService.editEmployee(employee);
	    return ResponseEntity.ok(employee);
	  }
}
