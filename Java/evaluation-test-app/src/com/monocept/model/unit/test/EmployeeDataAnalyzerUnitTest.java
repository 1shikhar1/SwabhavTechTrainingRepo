package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Employee;
import com.monocept.model.EmployeeDataAnalyzer;
import com.monocept.model.EmployeeDataReaderFromUrl;

class EmployeeDataAnalyzerUnitTest {

	EmployeeDataReaderFromUrl reader = new EmployeeDataReaderFromUrl("https://swabhav-tech.firebaseapp.com/emp.txt");
//	EmployeeDataAnalyzer analyzer = new EmployeeDataAnalyzer(reader.getData());
	
	@Test
	void findCeoTest() throws IOException {
//		ArrayList<Employee> empData = reader.getData();
//		assertEquals(analyzer.findCeo(empData).getId(),7839);
	}
	
	@Test
	void getJobWiseEmployeeCountTest() throws IOException {
		ArrayList<Employee> empData = reader.getData();
//		HashMap<String, Integer> jobWiseEmpList = analyzer.getJobWiseEmployeeCount(empData);
		
//		assertEquals(jobWiseEmpList.get("'PRESIDENT'"),1);
//		assertEquals(jobWiseEmpList.get("'SALESMAN'"),4);
//		assertEquals(jobWiseEmpList.get("'MANAGER'"),3);
//		assertEquals(jobWiseEmpList.get("'CLERK'"),4);
//		assertEquals(jobWiseEmpList.get("'ANALYST'"),2);
		
	}
	
}
