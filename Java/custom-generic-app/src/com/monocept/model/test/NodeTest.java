package com.monocept.model.test;

import com.monocept.model.Node;

public class NodeTest {
	public static void main(String args[]) {
		
		Node<String> n1 = new Node<String>();
		n1.setData("Abhishek");
		
		Node<String> n2 = new Node<String>();
		n2.setData("Vineet");
		
		Node<String> n3 = new Node<String>();
		n3.setData("Nikhil");
		
		n1.setNextNode(n2);
		
		n2.setNextNode(n3);
		
		printDetails(n1);
	}
	
	public static <T> void printDetails(Node<T> head) {
		
		while(head!=null) {
			System.out.println(head.getData());
			head = head.getNextNode();
		}
	}
}
