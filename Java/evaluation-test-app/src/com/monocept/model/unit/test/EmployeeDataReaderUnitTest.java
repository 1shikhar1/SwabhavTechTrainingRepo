package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.monocept.model.Employee;
import com.monocept.model.EmployeeDataReaderFromUrl;

class EmployeeDataReaderUnitTest {
	
	EmployeeDataReaderFromUrl reader = new EmployeeDataReaderFromUrl("https://swabhav-tech.firebaseapp.com/emp.txt");

	@Test
	void dataReaderTest() throws IOException {
		
		ArrayList<Employee> empData = reader.getData();
		
		assertEquals(empData.size(),14);
		
	}

}
