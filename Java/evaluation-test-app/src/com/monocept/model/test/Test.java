package com.monocept.model.test;

import java.io.IOException;
import java.util.*;
import com.monocept.model.*;

public class Test {
	public static void main(String args[]) throws IOException {
		
		EmployeeDataReader reader = new EmployeeDataReaderFromUrl("https://swabhav-tech.firebaseapp.com/emp.txt");
		EmployeeDataAnalyzer analyzer = new EmployeeDataAnalyzer(reader.getData());
		System.out.println("CEO-> "+analyzer.getCeo());
		
		HashMap<String, Integer> jobCount = analyzer.getJobWiseEmployeeCount();
		printJobWiseEmpList(jobCount);
		
		
		System.out.println("\n------------------------------------------------------------------------------------------------------------");
		
		reader = new EmployeeDataReaderFromFile("dataFile.txt");
		EmployeeDataAnalyzer analyzer1 = new EmployeeDataAnalyzer(reader.getData());
		System.out.println(analyzer.getCeo());
		
		jobCount = analyzer1.getJobWiseEmployeeCount();
		printJobWiseEmpList(jobCount);
	}
	
	public static void printDetails(ArrayList<Employee> empData) {
		for(Employee emp : empData)
			System.out.println(emp);
		System.out.println();
	}
	
	public static void printJobWiseEmpList(HashMap<String, Integer> empData) {
		for (String key : empData.keySet()) {
			System.out.println(key+" : "+empData.get(key));
		}
	}
}
