package com.monocept.model;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddMovie extends JFrame {
	static AddMovie frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AddMovie();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public AddMovie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAddMovie = new JLabel("Add Movie");
		lblAddMovie.setForeground(Color.DARK_GRAY);
		lblAddMovie.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JLabel lblName = new JLabel("Name:");
		JLabel lblGenre = new JLabel("Genre:");
		JLabel lblYear = new JLabel("Year:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Movie");
		btnNewButton.setForeground(Color.DARK_GRAY);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			String genre=textField_1.getText();
			String year=textField_2.getText();
			
			MovieStore store = new MovieStore();
			
			try {
				store.addMovie(name, genre, year);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Menu.main(new String[]{});
			frame.dispose();
			}
		});
		
		contentPane.add(lblName);
		contentPane.add(textField);
		
		contentPane.add(lblGenre);
		contentPane.add(textField_1);
		
		contentPane.add(lblYear);
		contentPane.add(textField_2);
		
		contentPane.add(btnNewButton);
		contentPane.add(btnBack);
	}
}
