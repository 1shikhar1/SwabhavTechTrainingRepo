package com.monocept.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GameGui extends JFrame {
	static GameGui frame;
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new GameGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public GameGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminSection = new JLabel("Menu");
		lblAdminSection.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAdminSection.setForeground(Color.GRAY);

		
		JButton btnNewButton = new JButton("Add Movie");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//			AddMovie.main(new String[]{});
//			frame.dispose();
			}
		});
		
		
		
		JButton btnViewMovies = new JButton("View Movies");
		btnViewMovies.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnViewMovies);
		
		btnViewMovies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//			ViewMovies.main(new String[]{});
//				new ViewMovies(store);
			}
		});
		
	}
}
