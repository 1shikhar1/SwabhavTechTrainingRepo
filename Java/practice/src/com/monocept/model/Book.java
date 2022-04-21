package com.monocept.model;

public class Book implements Comparable<Book>{
	String title;

	public Book(String t) {
		title = t;
	}
	
	public int compareTo(Book b) {
		return title.compareTo(b.title);
	}
	
	public boolean equals(Object a) {
		 Book b = (Book) a;
		 return title.equals(b.title);
		 }
	
	public int hashCode() {
		 return title.hashCode();
		 }
}