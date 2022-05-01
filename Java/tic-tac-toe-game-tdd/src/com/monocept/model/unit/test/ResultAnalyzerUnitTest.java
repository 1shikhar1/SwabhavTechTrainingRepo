package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Board;
import com.monocept.model.Mark;
import com.monocept.model.Result;
import com.monocept.model.ResultAnalyzer;

class ResultAnalyzerUnitTest {

	@Test
	void shouldShowWinResultForXDiagonally() {
		Board board = new Board();
		board.getCells()[0].setMark(Mark.X);
		board.getCells()[4].setMark(Mark.X);
		board.getCells()[8].setMark(Mark.X);
		ResultAnalyzer analyzer = new ResultAnalyzer(board); 
		assertTrue(Result.WIN==analyzer.analyseResult());
	}
	
	@Test
	void shouldShowWinResultForNoughtDiagonally() {
		Board board = new Board();
		board.getCells()[0].setMark(Mark.O);
		board.getCells()[4].setMark(Mark.O);
		board.getCells()[8].setMark(Mark.O);
		ResultAnalyzer analyzer = new ResultAnalyzer(board); 
		assertTrue(Result.WIN==analyzer.analyseResult());
	}
	
	@Test
	void shouldShowWinResultForXVirtically() {
		Board board = new Board();
		board.getCells()[1].setMark(Mark.X);
		board.getCells()[4].setMark(Mark.X);
		board.getCells()[7].setMark(Mark.X);
		ResultAnalyzer analyzer = new ResultAnalyzer(board); 
		assertTrue(Result.WIN==analyzer.analyseResult());
	}
	
	@Test
	void shouldShowWinResultForNoughtVirtically() {
		Board board = new Board();
		board.getCells()[2].setMark(Mark.O);
		board.getCells()[5].setMark(Mark.O);
		board.getCells()[8].setMark(Mark.O);
		ResultAnalyzer analyzer = new ResultAnalyzer(board); 
		assertTrue(Result.WIN==analyzer.analyseResult());
	}

	@Test
	void shouldShowWinResultForXHorizontally() {
		Board board = new Board();
		board.getCells()[0].setMark(Mark.X);
		board.getCells()[1].setMark(Mark.X);
		board.getCells()[2].setMark(Mark.X);
		ResultAnalyzer analyzer = new ResultAnalyzer(board); 
		assertTrue(Result.WIN==analyzer.analyseResult());
	}
	
	@Test
	void shouldShowWinResultForNoughtHorizontally() {
		Board board = new Board();
		board.getCells()[6].setMark(Mark.O);
		board.getCells()[7].setMark(Mark.O);
		board.getCells()[8].setMark(Mark.O);
		ResultAnalyzer analyzer = new ResultAnalyzer(board); 
		assertTrue(Result.WIN==analyzer.analyseResult());
	}
	
	@Test
	void shouldShowProgressResult() {
		Board board = new Board();
		board.getCells()[6].setMark(Mark.O);
		board.getCells()[7].setMark(Mark.X);
		ResultAnalyzer analyzer = new ResultAnalyzer(board); 
		assertTrue(Result.PROGRESS == analyzer.analyseResult());
	}
}
