package com.monocept.model;

import java.io.IOException;
import java.util.*;

import com.monocept.model.Employee;
import com.monocept.model.ReadDataFromFile;

public class DataAnalyzer {
	String ceo=null;
	
	public String getCeo() throws IOException {
		ReadDataFromFile read = new ReadDataFromFile();
		HashSet<Employee> empList = read.readData();
		
		empList.stream().filter(emp -> emp.getJob().contains("PRESIDENT")).forEach(emp -> {
			ceo = emp.getEmployeeName() + "       " + emp.getSalary();
		});
		
		return ceo;
	}
	
	public HashMap<String, Integer> getJobWiseEmployeeCount() throws IOException {
		
		ReadDataFromFile read = new ReadDataFromFile();
		HashSet<Employee> empList = read.readData();
		
		HashMap<String, Integer> jobWiseCount = new HashMap<String, Integer>();

		empList.stream().map(emp -> {
			if (!jobWiseCount.containsKey(emp.getJob()))
				jobWiseCount.put(emp.getJob(), 0);
			jobWiseCount.put(emp.getJob(), jobWiseCount.get(emp.getJob()) + 1);
			return null;
		}).forEach(data -> System.out.print(""));
		
		return jobWiseCount;
	}
}
