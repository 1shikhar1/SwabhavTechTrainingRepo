package com.monocept.model;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String job;
	private int mgrId;
	private String doj;
	private double sal;
	private String comm;
	private int deptNo;
	
	public Employee(int id, String name, String job, int mgrId, String doj, double sal, String comm, int deptNo) {
		this.id = id;
		this.name = name;
		this.job = job;
		this.mgrId = mgrId;
		this.doj = doj;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getJob() {
		return job;
	}
	
	public int getMgrId() {
		return mgrId;
	}
	
	public String getDoj() {
		return doj;
	}
	
	public double getSal() {
		return sal;
	}
	
	public String getComm() {
		return comm;
	}
	
	public int getDeptNo() {
		return deptNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		Integer id1 = id;
		Integer id2 = e.id;
		return id1.equals(id2);
	}
	
	@Override
	public int hashCode() {
		return ((Integer)id).hashCode();
	}

	@Override
	public int compareTo(Employee o) {
		return  ((Integer)id).compareTo(o.id);
	}
	
	@Override
	public String toString() {
		String res = "";
		res = res + "Id: "+id+"\t";
		res = res + "Name: "+name+"\t";
		res = res + "Job: "+job+"\t";
		res = res + "Manager Id: "+mgrId+"\t";
		res = res + "Date of joining: "+doj+"\t";
		res = res + "Salary: "+sal+"\t";
		res = res + "Job: "+job+"\t";
		res = res + "Comm: "+comm+"\t";
		res = res + "Department No: "+deptNo+"\t";
		
		return res;
	}
}
