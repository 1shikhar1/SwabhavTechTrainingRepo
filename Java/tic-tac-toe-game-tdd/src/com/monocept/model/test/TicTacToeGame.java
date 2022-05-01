package com.monocept.model.test;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import com.monocept.model.Board;
import com.monocept.model.Game;
import com.monocept.model.Mark;
import com.monocept.model.Player;
import com.monocept.model.Result;
import com.monocept.model.ResultAnalyzer;

public class TicTacToeGame implements ActionListener {

  
    JFrame frame = new JFrame();
    JPanel t_panel = new JPanel();
    JPanel bt_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] bton = new JButton[9];
    Game g;
    

    TicTacToeGame() {

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

        t_panel.setLayout(new BorderLayout());
        t_panel.setBounds(0, 0, 800, 100);

        bt_panel.setLayout(new GridLayout(3, 3));
        bt_panel.setBackground(new Color(150, 150, 150));

        for (int i = 0; i < 9; i++) {
            bton[i] = new JButton();
            bt_panel.add(bton[i]);
            bton[i].setFont(new Font("Ink Free", Font.BOLD, 120));
            bton[i].setFocusable(false);
            bton[i].addActionListener(this);
        }
        
        t_panel.add(textfield);
        frame.add(t_panel, BorderLayout.NORTH);
        frame.add(bt_panel);

        startGame();
    }
    
    public void startGame() {
        
		Player players[] = {new Player("Rohan",Mark.O), new Player("Shikhar",Mark.X)};
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
            new TicTacToeGame();
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