package com.monocept.model;

import java.io.IOException;
import java.util.ArrayList;

public interface EmployeeDataReader {
	public ArrayList<Employee> getData() throws IOException;
}
