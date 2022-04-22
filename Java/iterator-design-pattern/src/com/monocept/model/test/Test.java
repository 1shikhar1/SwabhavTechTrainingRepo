package com.monocept.model.test;

import com.monocept.model.Iterator;
import com.monocept.model.NamesRepository;

public class Test {
	public static void main(String args[]) {
		NamesRepository repo = new NamesRepository("Rohan Abhishek Vineet Shikhar");
		
		Iterator itr = repo.createIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
