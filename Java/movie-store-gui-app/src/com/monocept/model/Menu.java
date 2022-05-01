package com.monocept.model;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame {
	static Menu frame;
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminSection = new JLabel("Menu");
		lblAdminSection.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAdminSection.setForeground(Color.GRAY);
		
		MovieStore store = new MovieStore();
		
		
		JButton btnNewButton = new JButton("Add Movie");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AddMovie.main(new String[]{});
			frame.dispose();
			}
		});
		
		JButton btnViewMovies = new JButton("View Movies");
		btnViewMovies.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnViewMovies);
		
		btnViewMovies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ViewMovies.main(new String[]{});
//				new ViewMovies(store);
			}
		});
		
		JButton btnClearMovies = new JButton("Clear Movies");
		btnClearMovies.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnClearMovies);
		
		btnClearMovies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			MovieStore store = new MovieStore();
			try {
				store.clearAllMovies();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
//			frame.dispose();
			}
		});
		
		
	}
}
