package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.monocept.model.Cell;
import com.monocept.model.Mark;
import com.monocept.model.customexception.CellMarkedRuntimeException;

class CellUnitTest {

	@Test
	void cellShouldBeEmptyOnceCreated() {
		Cell c = new Cell();
		assertTrue(null == c.getMark());
	}

	@Test
	void cellShouldBeAbleToMarkNought() {
		Cell c = new Cell();
		c.setMark(Mark.O);
		assertTrue(Mark.O == c.getMark());
	}
	
	@Test
	void cellShouldBeAbleToMarkCross() {
		Cell c = new Cell();
		c.setMark(Mark.X);
		assertTrue(Mark.X == c.getMark());
	}
	
	@Test
	void shouldThrowExceptionMarkTwice() {
		Cell c = new Cell();
		c.setMark(Mark.O);
		
		CellMarkedRuntimeException ex = assertThrows(CellMarkedRuntimeException.class,()->c.setMark(Mark.X));
		
		assertTrue(ex.getMessage()=="Cell is already marked");
	}
}
