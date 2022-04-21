package com.monocept.model;

import java.io.*;
import java.net.*;
import java.util.*;

public class EmployeeDataReaderFromUrl implements EmployeeDataReader {
	
	private String link;
	
	public EmployeeDataReaderFromUrl(String link) {
		this.link = link;
	}
	
	public ArrayList<Employee> getData() throws IOException{
		
		String result;
		
		StringBuilder data = new StringBuilder();
		
		URL url = new URL(link);
		URLConnection conn = url.openConnection();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String line;
		
		while((line = bufferedReader.readLine())!=null) {
			data.append(line+"\n");
		}
		bufferedReader.close();
		
		result = data.toString();
		
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
