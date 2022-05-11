package com.monocept.test;

import java.util.Scanner;

import com.monocept.gui.TicTacToe;
import com.monocept.model.*;

public class ConsoleGame {
	public static void main(String args[]) {
		Player players[] = {new Player("Rohan",Mark.O), new Player("Shikhar",Mark.X)};
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		Game g = new Game(players, board, analyzer);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Game started!");
		System.out.println(g.getCurrentPlayer()+"'s turn");
		System.out.println("Enter the position");
		
	}
}
