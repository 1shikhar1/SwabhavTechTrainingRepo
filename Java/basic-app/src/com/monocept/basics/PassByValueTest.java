package com.monocept.basics;

public class PassByValueTest {
	public static void main(String args[]) {
		int score = 155;
		
		updateScoreToZero(score);
		
		System.out.println(score);
		
		int scores[]= {100,90,80};
		updateScoresToZero(scores);
		
		for(int s: scores)
			System.out.println(s);
	}
	
	static void updateScoreToZero(int s){
		s = 0;
	}
	
	static void updateScoresToZero(int s[]){
		
		for(int i=0;i<s.length;i++)
		s[i] = 0;
	}
}
