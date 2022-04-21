package com.monocept.model;

import java.util.*;

public class SetPractice {
	public static void main(String args[]) {
		
		ArrayList<Book> bookLst = new ArrayList<>();

		Book b1 = new Book("You can win");
		Book b2 = new Book("Finding emo");
		Book b3 = new Book("How cat works");
		Book b4 = new Book("The rudest book ever");
		Book b5 = new Book("Finding emo");
		Book b6 = b1;
		

		bookLst.add(b1);
		bookLst.add(b2);
		bookLst.add(b3);
		bookLst.add(b4);
		bookLst.add(b5);
		bookLst.add(b1);
		
		HashSet<Book> bookSet = new HashSet<>(bookLst);
		
		for(Book b: bookSet) 
			System.out.println(b.title);
	}
}
