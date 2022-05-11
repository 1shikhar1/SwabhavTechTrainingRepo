package com.monocept.model;

public class Game {
	private Result result;
	private Player currentPlayer;
	private Player players[];
	private ResultAnalyzer resultAnalyzer;
	private Board board;
	private int playerSelector;
	
	public Game(Player players[], Board board, ResultAnalyzer resultAnalyzer) {
		this.players = players;
		this.board = board;
		this.resultAnalyzer = resultAnalyzer;
		playerSelector = (int) Math.round(Math.random());
	}
	
	public void play(int cellLocation) {
		
		board.markAtCellLocation(cellLocation, getCurrentPlayer().getMark());
		result = resultAnalyzer.analyseResult();
		
		if(result == Result.WIN)
			return;
		
		if(playerSelector==0)
			playerSelector=1;
		else
			playerSelector=0;
	}
	
	public Player getCurrentPlayer() {
		return players[playerSelector];
	}
	
	public Result getStatus() {
		return result;
	}
	
	
	
}
