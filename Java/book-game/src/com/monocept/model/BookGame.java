package com.monocept.model;

import java.util.Random;
import java.util.Scanner;

public class BookGame {
	
	private static final int bookPages = 300;
	
	public void play() {
		
		int firstPlayerData[] = new int[2];
		int secondPlayerData[] = new int[2];
		
		System.out.println("Player 1");
		firstPlayerData = turn();
		System.out.println("Total score: "+firstPlayerData[0]);
		System.out.println("--------------------------");
		
		System.out.println("\nPlayer 2");
		secondPlayerData = turn();
		System.out.println("Total score: "+secondPlayerData[0]);
		
		if(firstPlayerData[0]>secondPlayerData[0]) {
			System.out.println("Player 1 won");
		}
		
		if(firstPlayerData[0]<secondPlayerData[0]) {
			System.out.println("Player 2 won");
		}
		
		if((firstPlayerData[0]==secondPlayerData[0]) && (firstPlayerData[1]<=secondPlayerData[1])) {
			System.out.println("Player 1 won");
		}
		
		if((firstPlayerData[0]==secondPlayerData[0]) && (firstPlayerData[1]>=secondPlayerData[1])) {
			System.out.println("Player 2 won");
		}
		
		if((firstPlayerData[0]==secondPlayerData[0]) && (firstPlayerData[1]==secondPlayerData[1])) {
			System.out.println("Tie");
		}
		
	}
	
	
	private int[] turn() {
		int totalScore = 0;
		int count = 0;
		Random rand = new Random();
		
		while(ask()) {
			int score=0;
			count++;
			int randomPageNumber = rand.nextInt(bookPages)+1;
			score = randomPageNumber%7;
			
			System.out.println("score: "+score);
	
			if(score==0)
				break;
			
			totalScore = totalScore + score;
		}
		
		int res[] = {totalScore,count};
		return res;
	}
	
	private boolean ask() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Open the book? (y/n): ");
		char openOrClose= sc.next().charAt(0);
		
		if(openOrClose == 'y' || openOrClose == 'Y')
			return true;
		return false;
	}
}
