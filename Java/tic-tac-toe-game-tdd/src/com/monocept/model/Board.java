package com.monocept.model;

import com.monocept.model.customexception.IndexOutOfBoundException;

public class Board {
	private Cell cells[];
	
	public Board() {
		cells = new Cell[9];
		
		for(int i=0;i<9;i++)
			cells[i] = new Cell();
	}
	
	public Cell[] getCells() {
		return cells;
	}
	
	public boolean isBoardFull() {
		for(int i=0; i<9;i++) {
			if(cells[i].getMark()==null)
				return false;
		}
		return true;
	}
	
	public void markAtCellLocation(int loc, Mark mark) {
		if(loc>=0 && loc<9)
			cells[loc].setMark(mark);
		else
			throw new IndexOutOfBoundException("Index out of bound");
	}
}
