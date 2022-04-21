package com.monocept.model;

import java.util.ArrayList;

public class ArrayListPractice1 {
	public static void main(String args[]) {
		ArrayList<Book> lst = new ArrayList<>();

		Book b1 = new Book("You can win");
		Book b2 = new Book("How cat works");
		Book b3 = new Book("Finding emo");

		lst.add(b1);
		lst.add(b2);
		lst.add(b3);
		for (Book b : lst)
			System.out.println(b.title);
	}

}
