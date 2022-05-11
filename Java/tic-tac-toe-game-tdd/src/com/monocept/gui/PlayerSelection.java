package com.monocept.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PlayerSelection extends JFrame {
	static PlayerSelection frame;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new PlayerSelection();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PlayerSelection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(new BorderLayout());
        headerPanel.setBounds(0, 0, 450, 100);
        
		JTextField headerField = new JTextField(); 
		
        headerField.setBackground(new Color(15, 77, 25));
        headerField.setForeground(new Color(111, 194, 124));
        headerField.setFont(new Font("Courier New", Font.BOLD, 65));
        headerField.setHorizontalAlignment(JLabel.CENTER);
        headerField.setText("Tic Tac Toe");
        headerField.setOpaque(true);
        
        headerPanel.add(headerField);
        contentPane.add(headerPanel, BorderLayout.NORTH);

		JLabel lblPlayer1 = new JLabel("Player 1:");
		JLabel lblPlayer2 = new JLabel("Player 2:");

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setForeground(Color.DARK_GRAY);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String player1 = textField_1.getText();
			String player2 = textField_2.getText();
			
			new TicTacToe(player1,player2);
			frame.dispose();
			}
		});
	
		contentPane.add(lblPlayer1);
		contentPane.add(textField_1);
		
		contentPane.add(lblPlayer2);
		contentPane.add(textField_2);
		
		contentPane.add(btnNewButton);
	
	}
}
