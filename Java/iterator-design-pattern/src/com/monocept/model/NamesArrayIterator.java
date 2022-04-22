//package com.monocept.model;
//
//public class NamesArrayIterator implements Iterator {
//	
//	int index=0;
//	NamesRepository repo;
//	
//	public NamesArrayIterator(NamesRepository repo) {
//		this.repo = repo;
//	}
//
//	@Override
//	public boolean hasNext() {
//		return index<repo.names.length;
//	}
//
//	@Override
//	public Object next() {
//		return repo.names[index++];
//	}
//
//}
