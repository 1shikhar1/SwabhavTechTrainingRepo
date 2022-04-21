package com.monocept.model.test;

import java.util.ArrayList;

import com.monocept.model.LineItem;

public class LineItemTest {
	public static void main(String args[]) {
		ArrayList<Object> set = new ArrayList<>(); 
		
		set.add(new LineItem(10,"Fan", 5, 1600));
		set.add(new LineItem(20,"Chair", 17, 400));
		set.add(new LineItem(30,"TV", 8, 35400));
		set.add(new LineItem(40,"AC", 9, 22400));


	}
}
