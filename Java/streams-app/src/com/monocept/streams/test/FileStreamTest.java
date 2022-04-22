package com.monocept.streams.test;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.regex.Pattern;

public class FileStreamTest {
	public static void main(String args[]) throws IOException {
		
		caseStudy1();
	}
	
	static void caseStudy1() throws IOException {
		
		Path p = Paths.get("C:\\Windows\\System32");
		
		System.out.println("Top 5 files in Windows\\\\System32 with maximum size\n");
		Files.list(p).sorted(new SortbySize()).limit(5).forEach(System.out::println);;
		
		
//		Files.lines(p).distinct().filter(n-> !Pattern.matches("^[0-9]+$", n)).forEach(FileStreamTest::printDetails);
	}

	static void printDetails(String line) {
		System.out.println(line);
	}
	
}




class SortbySize<WindowsPathWithAttributes> implements Comparator<WindowsPathWithAttributes> {
	 
    public int compare(WindowsPathWithAttributes a, WindowsPathWithAttributes b)
    {
 
        try {
			return (int) (Files.size((Path) b) - Files.size((Path) a));
		} catch (IOException e) {
			e.printStackTrace();
		}
        return 0;
    }
}