package com.monocept.model;

import java.util.Random;
import java.util.Scanner;

public class PigGame {
	private int turn = 1;
	private int finalScore = 0;

	public void play() {
		int turnScore = 0;
		
		while(true) {
			System.out.println("Turn: "+turn);
			turnScore = rollTill();
			
			finalScore = finalScore + turnScore;
			
			if(finalScore>=20)
				break;
			
			System.out.println("Turn score: "+turnScore);
			System.out.println("Total score: "+finalScore);
			System.out.println("Total turn: "+turn);
			System.out.println("--------------------------");
			turn++;
		}
		System.out.println("Turn score: "+turnScore);
		System.out.println("Total score: "+finalScore);
		System.out.println("Total turn: "+turn);
		System.out.println("You won!!");
		

	}
	
	public int rollTill() {
		int turnScore = 0;
		
		while(ask()) {
			int diceScore = rollDice();
			System.out.println(diceScore);
	
			if(diceScore==1)
				return 0;
			turnScore = turnScore + diceScore;
			
			if(turnScore+finalScore>=20)
				return turnScore;
		}
		
		return turnScore;
	}

	public int rollDice() {
		Random rand = new Random();
		return rand.nextInt(6) + 1;
	}
	
	
	public boolean ask() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Roll or hold? (r/h): ");
		char rollOrHold = sc.next().charAt(0);
		
		if(rollOrHold == 'h' || rollOrHold == 'H')
			return false;
		return true;
	}
}
