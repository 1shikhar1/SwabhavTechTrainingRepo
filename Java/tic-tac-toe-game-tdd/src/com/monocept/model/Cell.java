package com.monocept.model;


import com.monocept.model.customexception.CellMarkedRuntimeException;

public class Cell {
	private Mark mark;
	
	public Cell() {
		mark = null;
	}
	
	public void setMark(Mark mark) {
		if(this.mark==null)
			this.mark = mark;
		else if(this.mark!=null)
			throw new CellMarkedRuntimeException("Cell is already marked");
	}
	
	public Mark getMark() {
		return mark;
	}
	
	public boolean isCellEmpty() {
		if(mark==null)
			return true;
		return false;
	}
}
