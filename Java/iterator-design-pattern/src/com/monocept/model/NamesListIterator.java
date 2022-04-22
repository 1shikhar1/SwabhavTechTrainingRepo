package com.monocept.model;

public class NamesListIterator implements Iterator {
	
	int index=0;
	NamesRepository repo;
	
	public NamesListIterator(NamesRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean hasNext() {
		return index<repo.names.size();
	}

	@Override
	public Object next() {
		return repo.names.get(index++);
	}

}
