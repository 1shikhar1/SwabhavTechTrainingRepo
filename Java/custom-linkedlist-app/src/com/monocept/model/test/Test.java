package com.monocept.model.test;

import com.monocept.model.*;

public class Test {
	public static void main(String args[]) {
		CustomLinkedList list = new CustomLinkedList();
		
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		list.display();
		list.remove(30);
		System.out.println();

		for(Node item: list) {
			System.out.println(item.data);
		}
	}
}
