package com.monocept.model.test;

import com.monocept.model.*;

public class StrategyTest {
	public static void main(String args[]) {
		Context context = new Context(new AddOperation());
		System.out.println(context.excuteStrategy(15, 10));
		
		context = new Context(new SubtractOperation());
		System.out.println(context.excuteStrategy(15, 10));
		
		context = new Context(new MultiplyOperation());
		System.out.println(context.excuteStrategy(15, 10));
	}
}
