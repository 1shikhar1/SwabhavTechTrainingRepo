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

import com.monocept.model.Department;
import com.monocept.model.dto.DepartmentDto;
import com.monocept.service.DepartmentService;

@RequestMapping("/api/v1/department")
@RestController
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping(path="/{id}")
	public ResponseEntity<DepartmentDto> getById(@PathVariable("id") int id){
		return ResponseEntity.ok(departmentService.getById(id));
	}
	
	@GetMapping(path="/all")
	public ResponseEntity<List<DepartmentDto>> getAll(){
		return ResponseEntity.ok(departmentService.getAll());
	}
	
	@PostMapping(path="/add",produces = "application/json")
	public ResponseEntity<Integer> addDepartment(@RequestBody Department dept){
		departmentService.addDepartment(dept);
		return ResponseEntity.ok(dept.getId());
	}
	
	@DeleteMapping("/{id}")  
	public void deleteStudent(@PathVariable("id") int id) {  
		departmentService.deleteDepartment(id);  
	}
	
	@PutMapping(path = "/edit")
	public ResponseEntity<Department> editStudent(@RequestBody Department department) {
	    departmentService.editDepartment(department);
	    return ResponseEntity.ok(department);
	  }
}
