package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.monocept.model.Board;
import com.monocept.model.Mark;
import com.monocept.model.customexception.CellMarkedRuntimeException;
import com.monocept.model.customexception.IndexOutOfBoundException;

class BoardUnitTest {

	@Test
	void shouldBeAbleToCreateABoardWith9Cells() {
		Board b = new Board();
		assertTrue(9==b.getCells().length);
	}
	
	@Test
	void shouldBeAbleToMarkAtSpecifiedLocation() {
		Board b = new Board();
		b.getCells()[2].setMark(Mark.O);
		assertTrue(Mark.O==b.getCells()[2].getMark());
	}
	
	@Test
	void shouldThrowExceptionIfWrongIndexPassed() {
		Board b = new Board();
		IndexOutOfBoundException ex = assertThrows(IndexOutOfBoundException.class,()->b.markAtCellLocation(22, Mark.X));
		assertTrue(ex.getMessage() == "Index out of bound");
	}
	
	@Test
	void shouldCheckIfBoardIsFull() {
		Board b = new Board();
		assertTrue(false==b.isBoardFull());
	}

}
