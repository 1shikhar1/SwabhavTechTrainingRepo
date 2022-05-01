package com.monocept.model;

public class Game {
	Result result;
	Player currentPlayer;
	Player players[];
	ResultAnalyzer resultAnalyzer;
	Board board;
	int flag;
	
	public Game(Player players[], Board board, ResultAnalyzer resultAnalyzer) {
		this.players = players;
		this.board = board;
		this.resultAnalyzer = resultAnalyzer;
		flag = (int) Math.round(Math.random());
	}
	
	public void play(int cellLocation) {
		
		board.markAtCellLocation(cellLocation, getCurrentPlayer().getMark());
		result = resultAnalyzer.analyseResult();
		
		if(result == Result.WIN)
			return;
		
		if(flag==0)
			flag=1;
		else
			flag=0;
	}
	
	public Player getCurrentPlayer() {
		return players[flag];
	}
	
	public Result getStatus() {
		return result;
	}
	
	
	
}
