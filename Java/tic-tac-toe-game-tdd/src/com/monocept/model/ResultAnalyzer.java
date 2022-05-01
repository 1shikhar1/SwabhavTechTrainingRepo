package com.monocept.model;

public class ResultAnalyzer {
	private Board board;
	
	public ResultAnalyzer(Board board) {
		this.board = board;
	}
	
	public Result analyseResult() {
		if(horizontalCheck())
			return Result.WIN;
		
		if(virticleCheck())
			return Result.WIN;
		
		if(diagonalCheck())
			return Result.WIN;
		
		if(board.isBoardFull())
			return Result.DRAW;
		
		return Result.PROGRESS;
	}
	
	private boolean horizontalCheck() {
		if(board.getCells()[0].getMark()!=null && (board.getCells()[0].getMark() == board.getCells()[1].getMark()) && (board.getCells()[1].getMark()  == board.getCells()[2].getMark())) {
			return true;
		}
		
		if(board.getCells()[3].getMark()!=null && (board.getCells()[3].getMark() == board.getCells()[4].getMark()) && (board.getCells()[4].getMark()  == board.getCells()[5].getMark())) {
			return true;
		}
		
		if(board.getCells()[6].getMark()!=null && (board.getCells()[6].getMark() == board.getCells()[7].getMark()) && (board.getCells()[7].getMark()  == board.getCells()[8].getMark())) {
			return true;
		}
		
		return false;
	}
	
	private boolean virticleCheck() {
		
		if(board.getCells()[0].getMark()!=null && (board.getCells()[0].getMark() == board.getCells()[3].getMark()) && (board.getCells()[3].getMark()  == board.getCells()[6].getMark())) {
			return true;
		}
			
		
		if(board.getCells()[1].getMark()!=null && (board.getCells()[1].getMark() == board.getCells()[4].getMark()) && (board.getCells()[4].getMark()  == board.getCells()[7].getMark())) {
			return true;
		}
			
		
		if(board.getCells()[2].getMark()!=null && (board.getCells()[2].getMark() == board.getCells()[5].getMark()) && (board.getCells()[5].getMark()  == board.getCells()[8].getMark())) {
			return true;
		}
			
		return false;
		
	}
	
	private boolean diagonalCheck() {
		if(board.getCells()[0].getMark()!=null && (board.getCells()[0].getMark() == board.getCells()[4].getMark()) && (board.getCells()[4].getMark()  == board.getCells()[8].getMark())) {
			return true;
		}
		
		if(board.getCells()[2].getMark()!=null && (board.getCells()[2].getMark() == board.getCells()[4].getMark()) && (board.getCells()[4].getMark()  == board.getCells()[6].getMark())) {
			return true;
		}
		
		return false;
	}
}
