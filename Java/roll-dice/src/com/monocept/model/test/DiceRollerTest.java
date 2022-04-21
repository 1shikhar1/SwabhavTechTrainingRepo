package com.monocept.model.test;

import java.util.*;

import com.monocept.model.DiceRoller;

public class DiceRollerTest {
	public static void main(String args[]) {
		DiceRoller dice = new DiceRoller();

	Map<Integer,Integer> result = dice.roll(10);
	
		for (Integer key : result.keySet()) {
			System.out.println(key+" : "+result.get(key));
		}
	}
}
