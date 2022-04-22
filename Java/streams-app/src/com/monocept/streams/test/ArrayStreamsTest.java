package com.monocept.streams.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ArrayStreamsTest {
	
	public static void main(String args[]) {
		

//		caseStudy1();
		caseStudy4();
//		caseStudy3();
	
	}
	
	static void caseStudy1() {
		String names[] = {"Vishak","Marry","Aditi","Vineet"};
		
		Arrays.stream(names).forEach(ArrayStreamsTest::printDetails);
		System.out.println();
		
		Arrays.stream(names).forEach(n->System.out.println(n));
		System.out.println();
	}

	static void caseStudy2() {
		String names[] = {"Vishak","Marry","Aditi","Vineet"};
		
		
		Stream<Object> quary = Arrays.stream(names)
		.filter(name-> name.toLowerCase().contains("a"))
		.sorted((n1,n2)->-n1.compareTo(n2))
		.limit(2)
		.map(name-> name.substring(0, 4));
		
		
		quary.forEach(System.out::println);
//		quary.forEach(System.out::println);
	}
	
	static void caseStudy3() {
		String names[] = {"Vishak","Marry","Aditi","Vineet"};
		
		Arrays.stream(names)
		.filter(name-> name.toLowerCase().contains("a"))
		.sorted((n1,n2)->-n1.compareTo(n2))
		.limit(2)
		.map(name-> name.substring(0, 4))
		.forEach(System.out::println);
	}
	
	
	
	
	static void caseStudy4() {
		
		Account accounts[] = {new Account(100,"Abhishek", 3000), new Account(100,"Rohan", 6000), new Account(100,"Vineet", 4000), new Account(100,"Shikhar", 4000)};

		System.out.println("Richest account holder: "+Arrays.stream(accounts).max(new SortbyBalance()).get());
		
		System.out.println("\nAccount holders name length greater than 6:\n ");
		
		Arrays.stream(accounts).filter(acc->acc.getName().length()>6).forEach(System.out::println);
		
		Double sum = Arrays.stream(accounts)
				  .map(x -> x.getBalance())
				  .reduce((double) 0, Double::sum);
		
		System.out.println("\nTotal balance sum: "+sum);
		
		
	}
	
	
//	static int sortName(String n1, String n2) {
//		return -n1.compareTo(n2);
//	}
	

	static boolean nameWithA(String name) {
		return name.toLowerCase().contains("a");
	}
	
	static void printDetails(String name) {
		System.out.println(name);
	}
}


class SortbyBalance implements Comparator<Account> {
	 
    public int compare(Account a, Account b)
    {
 
        return (int) (a.getBalance() - b.getBalance());
    }
}
