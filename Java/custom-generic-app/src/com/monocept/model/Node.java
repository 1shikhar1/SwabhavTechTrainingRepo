package com.monocept.model;

public class Node<T> {
	T data;
	Node<T> next;
	
	public void setData(T data) {
		this.data = data;
	}

	public void setNextNode(Node<T> next) {
		this.next = next;
	}
	
	public T getData() {
		return data;
	}
	
	public Node<T> getNextNode(){
		return next;
	}
}
