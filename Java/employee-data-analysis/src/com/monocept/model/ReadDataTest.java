package com.monocept.model;

// need to refactor this code

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadDataTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		Path filepath = Paths.get("DBFile.txt");

		HashSet<Employee> empList = (HashSet<Employee>) Files.lines(filepath).map(data -> data.split(",")).map(data -> {
			return (new Employee(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]));
			
		}).collect(Collectors.toSet());
		
		// find CEO
		empList.stream().filter(emp -> emp.getJob().contains("PRESIDENT")).forEach(emp -> {
			System.out.println(emp.getEmployeeName() + "       " + emp.getSalary());
		});

		HashMap<String, Integer> jobWiseCount = new HashMap<String, Integer>();

		empList.stream().map(emp -> {
			if (!jobWiseCount.containsKey(emp.getJob()))
				jobWiseCount.put(emp.getJob(), 0);
			jobWiseCount.put(emp.getJob(), jobWiseCount.get(emp.getJob()) + 1);
			return null;
		}).forEach(data -> System.out.print(""));

		System.out.println(jobWiseCount);

	}

}
