package com.monocept.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.Department;
import com.monocept.model.dto.DepartmentDto;
import com.monocept.repository.DepartmentRepository;

@Service("DepartmentSvc")
public class DepartmentService {
	@Autowired
	DepartmentRepository repo;
	
	public DepartmentDto getById(int id) {
		Department dept = repo.getById(id);
		return new DepartmentDto(dept.getId(),dept.getName());
	}
	
	public List<DepartmentDto> getAll(){
		return repo.get().stream()
				.map(d->new DepartmentDto(d.getId(),d.getName())).collect(Collectors.toList());
	}
	
	public void addDepartment(Department dept) {
		repo.addDepartment(dept);
	}

	public void deleteDepartment(int id) {
		repo.deleteDepartment(id);
	}
	
	public void editDepartment(Department department) {
		repo.editDepartment(department);
	}
}
