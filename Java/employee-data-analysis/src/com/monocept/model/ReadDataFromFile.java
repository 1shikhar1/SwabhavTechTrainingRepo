package com.monocept.model;

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

public class ReadDataFromFile {
	
	public HashSet<Employee> readData() throws IOException {
		Path filepath = Paths.get("DBFile.txt");
		
		HashSet<Employee> empList = (HashSet<Employee>) Files.lines(filepath).map(data -> data.split(",")).map(data -> {
			return (new Employee(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]));
		}).collect(Collectors.toSet());
		
		return empList;
	}
}
