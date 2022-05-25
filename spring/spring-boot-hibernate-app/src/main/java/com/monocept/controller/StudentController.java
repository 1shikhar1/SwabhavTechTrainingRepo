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

import com.monocept.model.Student;
import com.monocept.model.dto.StudentDto;
import com.monocept.service.StudentService;

@RequestMapping("/api/v1/student")
@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(path="/all")
	public  ResponseEntity<List<StudentDto>> getAll(){
		
		return ResponseEntity.ok(studentService.getAll());
	}
	
//	@GetMapping(path="/single/{roll}")
//	public  ResponseEntity<Student> getSingle(@PathVariable("roll") String roll){
//		return ResponseEntity.ok(studentService.getSingle(Integer.valueOf(roll)));
//	}
	
	
	@PostMapping(path="/add",produces = "application/json")
	public ResponseEntity<Integer> addStudent(@RequestBody Student std){
		studentService.addStudent(std);
		return ResponseEntity.ok(std.getRollNo());
	}
	
//	@PostMapping(path="/edit/{roll}",produces = "application/json")
//	public ResponseEntity<Student> updateStudent(@PathVariable String roll, @RequestBody Student std){
//		studentService.updateStudent(Integer.valueOf(roll), std);
//		return ResponseEntity.ok(std);
//	}
	
	@DeleteMapping("/{rollNo}")  
	public void deleteStudent(@PathVariable("rollNo") int roll) {  
		studentService.deleteStudent(roll);  
	}  
	
	@PutMapping(path = "/edit")
	  public ResponseEntity<Student> editStudent(@RequestBody Student student) {
	    studentService.editStudent(student);
	    return ResponseEntity.ok(student);
	  }
		
}
