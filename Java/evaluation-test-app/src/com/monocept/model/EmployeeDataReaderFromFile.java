package com.monocept.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeeDataReaderFromFile implements EmployeeDataReader {
	
	private String fileLocation;
	
	public EmployeeDataReaderFromFile(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	@Override
	public ArrayList<Employee> getData() throws IOException {
		String result = "";
		
		try {
		      File myObj = new File(fileLocation);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        result = result + data +"\n"; 
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		HashSet<Employee> employeeSet = new HashSet<Employee>();
		
		String[] res = result.split("[\n]");
		for(String myStr: res) {
			String[] tmpRes = myStr.split("[,]");
			
			int id;
			String name;
			String job;
			int mgrId;
			String doj;
			double sal;
			String comm;
			int deptNo;
			
			try {
				id = Integer.parseInt(tmpRes[0]);
			}
			catch (NumberFormatException nfe)
			{
				id = -1;
			}
			
			name = tmpRes[1];
			job = tmpRes[2];
			
			try {
				mgrId = tmpRes[3]!=null ? Integer.parseInt(tmpRes[3]) : 0;
			}
			catch (NumberFormatException nfe) {
				mgrId = -1;
			}
			
			doj = tmpRes[4];
			
			try {
				sal = Double.parseDouble(tmpRes[5]);
			}
			catch (NumberFormatException nfe) {
				sal = -1;
			}
			
			comm = tmpRes[6];
			
			try {
				deptNo = Integer.parseInt(tmpRes[7]);
			}
			catch (NumberFormatException nfe) {
				deptNo = -1;
			}
			
			employeeSet.add(new Employee(id, name, job, mgrId, doj, sal, comm, deptNo));
		}
		
		ArrayList<Employee> employeeList = new ArrayList<>(employeeSet);
		
		return employeeList;
		
	}

}
