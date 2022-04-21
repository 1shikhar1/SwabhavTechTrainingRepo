package com.monocept.model;

import java.util.*;

public class EmployeeDataAnalyzer {
	
	private ArrayList<Employee> empList;
	
	public EmployeeDataAnalyzer(ArrayList<Employee> empList) {
		this.empList = empList;
	}
	
	public Employee getCeo() {
		String presi = "'PRESIDENT'";
		for(Employee emp: empList) {
			String empJob = emp.getJob();
			if(empJob.equals(presi))
				return emp;
		}
		return null;
	}
	
	public HashMap<String, Integer> getJobWiseEmployeeCount() {
		
		HashMap<String,Integer> empCount = new HashMap<String,Integer>();
		for(Employee emp: empList) {
			if(empCount.containsKey((emp.getJob())))
				empCount.put(emp.getJob(), empCount.get(emp.getJob())+1);
			
			if(!empCount.containsKey((emp.getJob())))
				empCount.put(emp.getJob(), 1);
		}
		
		return empCount;
	}
}
