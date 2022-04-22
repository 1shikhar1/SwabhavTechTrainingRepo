package com.monocept.model;

import java.util.*;

public class NamesRepository {
	List<String> names = new ArrayList<>();
	
	public NamesRepository(String names) {
		String n[] = names.split(" ");
		
		for(String str : n) {
			this.names.add(str);
		}
	}
	
	public Iterator createIterator() {
		return new NamesListIterator(this);
	}
}
