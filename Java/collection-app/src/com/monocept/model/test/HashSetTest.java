package com.monocept.model.test;

import java.util.*;

import com.monocept.model.LineItem;

	public class HashSetTest {
	public static void main(String args[]) {
		HashSet<LineItem> set = new HashSet<>(); 
		
		set.add(new LineItem(10,"Fan", 5, 1600));
		set.add(new LineItem(20,"Chair", 17, 400));
		set.add(new LineItem(30,"TV", 8, 35400));
		set.add(new LineItem(40,"AC", 9, 22400));
		set.add(new LineItem(20,"Chair", 17, 700000));
		
		printDetails(set);
	}
	
	public static void printDetails(Iterable<LineItem> items) {
		for(LineItem itm: items)
		System.out.println("Id: "+itm.getId()+"\tName: "+itm.getName()+"\tQuantity: "+itm.getQuantity()+"\tUnit price: "+itm.getunitPrice());
	}
	
//	public static void printDetails(Object obj) {
//		LineItem itm = (LineItem)obj;
//		System.out.println("Id: "+itm.getId()+"\tName: "+itm.getName()+"\tQuantity: "+itm.getQuantity()+"\tUnit price: "+itm.getunitPrice());
//	}
}
