package com.monocept.model;

public class Employee {

	private String employeeId;
	private String employeeName;
	private String job;
	private String jobId;
	private String doj;
	private String salary;
	private String comm;
	private String deptno;

	public Employee(String employeeId, String employeeName, String job, String jobId, String doj, String salary,
			String comm, String deptno) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.job = job;
		this.jobId = jobId;
		this.doj = doj;
		this.salary = salary;
		this.comm = comm;
		this.deptno = deptno;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getJob() {
		return job;
	}

	public String getJobId() {
		return jobId;
	}

	public String getDoj() {
		return doj;
	}

	public String getSalary() {
		return salary;
	}

	public String getComm() {
		return comm;
	}

	public String getDeptno() {
		return deptno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		return true;
	}
}
