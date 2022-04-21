package com.monocept.model;

import com.monocept.customException.NegativeValueNotAllowed;

public class OddEvenGenerator {

	public int[] getEvenNosTill(int limit) throws NegativeValueNotAllowed {
		if (limit < 0)
			throw new NegativeValueNotAllowed("Negative value is not allowed");

		int n = limit / 2;
		int result[] = new int[n];
		for (int i = 1, index = 0; i <= n; i++, index++)
			result[index] = 2 * i;
		return result;
	}

	public int[] getOddNosTill(int limit) throws NegativeValueNotAllowed {
		if (limit < 0)
			throw new NegativeValueNotAllowed("Negative value is not allowed");
		
		int n = limit % 2 == 0 ? limit / 2 : (limit / 2) + 1;
		int result[] = new int[n];
		for (int i = 0, index = 0; i < n; i++, index++)
			result[index] = 2 * i + 1;
		return result;
	}
}