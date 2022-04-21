package com.monocept.model;

import java.util.Iterator;

public class CustomLinkedList implements Iterable<Node> {
	
	Node head;
	
	public void add(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
		}else if(head.next==null) {
			head.next = newNode; 
		}else if(head.next!=null) {
			
			Node temp = head;
			while(temp.next!=null)
				temp = temp.next;
			
			temp.next = newNode;
		}
		
	}
	
	public void remove(int data) {
		Node currNode = head, prev=null;
		
        if (currNode != null && currNode.data == data) {
            head = currNode.next; 
            return;
        }
		
		while (currNode != null && currNode.data != data) {
            prev = currNode;
            currNode = currNode.next;
        }
		
		if (currNode != null) {
            prev.next = currNode.next;
        }
		
	}
	
	public void display() {
		Node temp = head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	@Override
	public Iterator<Node> iterator() {
		return new ListIterator(head);
	}

}

class ListIterator implements Iterator<Node>{

	private Node current;
	
	public ListIterator(Node head) {
		current = head;
	}
	
	@Override
	public boolean hasNext() {
		return current!=null;
	}

	@Override
	public Node next() {
		Node temp = current;
		current = current.next;
		return temp;
	}
	
}
