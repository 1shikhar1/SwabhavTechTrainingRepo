package com.monocept.model;

import java.util.*;
import java.util.Random;

public class DiceRoller {
	
	public Map<Integer,Integer> roll(int times) {
		
		HashMap<Integer,Integer> result = new HashMap<> ();
		Random rand = new Random();
		
		for(int i = 0; i<times; i++)
		{
			int num = rand.nextInt(6)+1;
			
			if(result.containsKey(num)) {
				result.put(num,result.get(num)+1);
			}
			
			if(!result.containsKey(num)) {
				result.put(num,1);
			}
		}
		return result;
	}
}
