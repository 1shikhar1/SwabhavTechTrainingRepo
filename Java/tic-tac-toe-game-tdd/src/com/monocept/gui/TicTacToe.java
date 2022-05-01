package com.monocept.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.monocept.model.Board;
import com.monocept.model.Game;
import com.monocept.model.Mark;
import com.monocept.model.Player;
import com.monocept.model.Result;
import com.monocept.model.ResultAnalyzer;

public class TicTacToe implements ActionListener {
  
    JFrame frame = new JFrame();
    JPanel headerPanel = new JPanel();
    JPanel btnPanel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] bton = new JButton[9];
    Game g;
    String player1;
    String player2;
    
    public TicTacToe(String player1, String player2) {
    	this.player1 = player1;
    	this.player2 = player2;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setTitle("Tic Tac Toe");
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        textfield.setBackground(new Color(15, 77, 25));
        textfield.setForeground(new Color(111, 194, 124));
        textfield.setFont(new Font("Courier New", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic Tac Toe");
        textfield.setOpaque(true);

        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBounds(0, 0, 800, 100);

        btnPanel.setLayout(new GridLayout(3, 3));
        btnPanel.setBackground(new Color(150, 150, 150));

        for (int i = 0; i < 9; i++) {
            bton[i] = new JButton();
            btnPanel.add(bton[i]);
            bton[i].setFont(new Font("Ink Free", Font.BOLD, 120));
            bton[i].setFocusable(false);
            bton[i].addActionListener(this);
        }
        
        headerPanel.add(textfield);
        frame.add(headerPanel, BorderLayout.NORTH);
        frame.add(btnPanel);

        startGame();
    }
    
    private void startGame() {
        
		Player players[] = {new Player(player1,Mark.O), new Player(player2,Mark.X)};
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board); 
		g = new Game(players,board,analyzer);
		
		textfield.setText(g.getCurrentPlayer().getName().toString()+"("+g.getCurrentPlayer().getMark().toString()+") turn");
    }

    public void gameOver(String s){
    	
        Object[] option={"Restart","Exit"};
        int n = JOptionPane.showOptionDialog(frame, "Game Over\n"+s,"Game Over",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,option,option[0]);
        if(n==0){
            frame.dispose();
            new TicTacToe(player1,player2);
        }
        else{
            frame.dispose();
        }
    }

    public void winner() {
        for (int i = 0; i < 9; i++) {
            bton[i].setEnabled(false);
        }
        textfield.setText(g.getCurrentPlayer().getName().toString()+"("+g.getCurrentPlayer().getMark().toString()+") Won");
        gameOver(g.getCurrentPlayer().getName().toString()+"("+g.getCurrentPlayer().getMark().toString()+") Won");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == bton[i]) {
                
                if (bton[i].getText() == "") {
                    bton[i].setText(g.getCurrentPlayer().getMark().toString());
                    
                    if(g.getCurrentPlayer().getMark()==Mark.O)
                    	bton[i].setForeground(new Color(0, 0, 255));
                    
                    if(g.getCurrentPlayer().getMark()==Mark.X)
                    	bton[i].setForeground(new Color(255, 0, 0));
                    
                    g.play(i);
                    
                    if(g.getStatus()==Result.WIN)
                    	winner();
                    
                    if(g.getStatus()==Result.DRAW) {
                    	textfield.setText("Match Draw");
                        gameOver("Match Draw");
                    }
                    textfield.setText(g.getCurrentPlayer().getName().toString()+"("+g.getCurrentPlayer().getMark().toString()+") turn");
                }
            }
        }
    }

}