package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Board;
import com.monocept.model.Game;
import com.monocept.model.Mark;
import com.monocept.model.Player;
import com.monocept.model.Result;
import com.monocept.model.ResultAnalyzer;

class GameUnitTest {

	@Test
	void whenGameStartsCurrentPlayerIsPlayer1() {
		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		Player players[] = {new Player("Rohan",Mark.O), new Player("Shikhar",Mark.X)};
		
		Game g = new Game(players, board, resultAnalyzer);
		assertTrue(g.getCurrentPlayer().getMark()==Mark.O);
	}
	
	@Test
	void afterFirstPayerTurnCurrentPlayerIsPlayer2() {
		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		Player players[] = {new Player("Rohan",Mark.O), new Player("Shikhar",Mark.X)};
		
		Game g = new Game(players, board, resultAnalyzer);
		g.play(6);
		assertTrue(g.getCurrentPlayer().getMark() == Mark.X);
	}
	
	@Test
	void shouldDisplayProgressAfterFirstPlay() {
		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		Player players[] = {new Player("Rohan",Mark.O), new Player("Shikhar",Mark.X)};
		
		Game g = new Game(players, board, resultAnalyzer);
		g.play(7);
		assertTrue(g.getStatus() == Result.PROGRESS);
	}
	
	@Test
	void shouldDisplayDraw() {
		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		Player players[] = {new Player("Rohan",Mark.O), new Player("Shikhar",Mark.X)};
		
		Game g = new Game(players, board, resultAnalyzer);
		g.play(0); //o
		g.play(2); //x
		g.play(1); //o
		g.play(3); //x
		g.play(5); //o
		g.play(4); //x
		g.play(6); //o
		g.play(7); //x
		g.play(8); //o
		assertTrue(g.getStatus() == Result.DRAW);
	}
	
	@Test
	void shouldDisplayWin() {
		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		Player players[] = {new Player("Rohan",Mark.O), new Player("Shikhar",Mark.X)};
		
		Game g = new Game(players, board, resultAnalyzer);
		g.play(5); //o
		g.play(2); //x
		g.play(0); //o
		g.play(6); //x
		g.play(1); //o
		g.play(4); //x
		assertTrue(g.getStatus() == Result.WIN);
	}
	
	@Test
	void shouldDisplayWinnerX() {
		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		Player players[] = {new Player("Rohan",Mark.O), new Player("Shikhar",Mark.X)};
		
		Game g = new Game(players, board, resultAnalyzer);
		g.play(5); //o
		g.play(2); //x
		g.play(0); //o
		g.play(6); //x
		g.play(1); //o
		g.play(4); //x
		assertTrue(g.getCurrentPlayer().getMark() == Mark.X);
	}

}
