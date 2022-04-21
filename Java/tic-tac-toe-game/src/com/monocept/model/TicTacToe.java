package com.monocept.model;

import java.util.*;

public class TicTacToe {
	
	private String[] board = new String[9];
	private String turn;
	
	public void play() {
		
		String winner = null;
		turn = "X";
		
		for (int i = 0; i < 9; i++) {
			board[i] = Integer.toString(i+1);
		}
		
		System.out.println("Welcome to Tic Tac Toe game developed by Shikhar.\n");
		printBoard();
		
		System.out.println("\nX's turn. Enter a slot number to place X :");
		
		while (winner == null) {
			int userInput;
			
			try {
				Scanner in = new Scanner(System.in);
				userInput = in.nextInt();
				if (!(userInput > 0 && userInput <= 9)) {
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}
			}
			catch (RuntimeException e) {
				System.out.println("Invalid input; re-enter slot number:");
				continue;
			}

			if (board[userInput - 1].equals(Integer.toString(userInput))) {
				board[userInput - 1] = turn;

				if (turn.equals("X")) {
					turn = "O";
				}
				else {
					turn = "X";
				}

				printBoard();
				winner = checkWinner();
			}
			else {
				System.out.println("Slot already filled; re-enter slot number:");
			}
		}
		
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("It's a draw! \nThanks for playing.");
		}
		
		else {
			System.out.println("Congratulations! " + winner+ "'s have won! \nThanks for playing.");
		}
	}
	
	private String checkWinner() {
		for (int i = 0; i < 8; i++) {
			String result = null;

			switch (i) {
			case 0:
				result = board[0] + board[1] + board[2];
				break;
			case 1:
				result = board[3] + board[4] + board[5];
				break;
			case 2:
				result = board[6] + board[7] + board[8];
				break;
			case 3:
				result = board[0] + board[3] + board[6];
				break;
			case 4:
				result = board[1] + board[4] + board[7];
				break;
			case 5:
				result = board[2] + board[5] + board[8];
				break;
			case 6:
				result = board[0] + board[4] + board[8];
				break;
			case 7:
				result = board[2] + board[4] + board[6];
				break;
			}
		
			if (result.equals("XXX")) {
				return "X";
			}
			
		
			else if (result.equals("OOO")) {
				return "O";
			}
		}
		
		for (int i = 0; i < 9; i++) {
			if (Arrays.asList(board).contains(Integer.toString(i+1))) {
				break;
			}
			else if (i == 8) {
				return "draw";
			}
		}

		System.out.println("\n"+turn + "'s turn; enter a slot number to place "+ turn + " :");
		return null;
	}

	
	private void printBoard() {
		System.out.println(" " + board[0] + " | "+ board[1] + " | " + board[2]+ " ");
		System.out.println("---+---+---");
		System.out.println(" " + board[3] + " | "+ board[4] + " | " + board[5]+ " ");
		System.out.println("---+---+---");
		System.out.println(" " + board[6] + " | "+ board[7] + " | " + board[8]+ " ");
	}
	
}
