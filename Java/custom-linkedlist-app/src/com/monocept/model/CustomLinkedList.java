package com.monocept.model;

import java.util.Iterator;

public class CustomLinkedList<T> {
	Node head;
	
	public void add(T data) {
		Node<T> newNode = new Node(data);
		
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

	
	public void remove(T data) {
		Node<T> currNode = head, prev=null;
		
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
		Node node = head;
		while (node!= null) {
			System.out.println(node.data);
			node = node.next;
		}
	}


	public Iterator<T> iterator() {
		return new ListIterator();
	}

  class ListIterator implements Iterator<T>{

	  Node current = head;

      @Override
      public boolean hasNext() {
          return current != null;
      }

      @Override
      public T next() {
          if(hasNext()){
              T data = (T) current.data;
              current = current.next;
              return data;
          }
          return null;
      }
  }

}

