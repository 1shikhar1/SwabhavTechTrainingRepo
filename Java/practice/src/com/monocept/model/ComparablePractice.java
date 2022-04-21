package com.monocept.model;

import java.util.ArrayList;
import java.util.*;

public class ComparablePractice {

	public static void main(String args[]) {
		ArrayList<Book> bookLst = new ArrayList<>();

		Book b1 = new Book("You can win");
		Book b2 = new Book("Finding emo");
		Book b3 = new Book("How cat works");
		

		bookLst.add(b1);
		bookLst.add(b2);
		bookLst.add(b3);
		for (Book b : bookLst)
			System.out.println(b.title);
		
		System.out.println();
		
		Collections.sort(bookLst);
		
		for (Book b : bookLst)
			System.out.println(b.title);
	}

}
