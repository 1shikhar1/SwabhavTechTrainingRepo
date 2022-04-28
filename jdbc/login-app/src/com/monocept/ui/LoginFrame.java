package com.monocept.ui;

import java.awt.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.monocept.repository.UserRepo;

public class LoginFrame extends JFrame{
	static LoginFrame frame;
	private JPanel contentPane;
	private JTextField idField;
	private JPasswordField passwordField; 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.DARK_GRAY);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JLabel lblId = new JLabel("User id:");
		JLabel lblPassword = new JLabel("password:");
		
		idField = new JTextField();
		idField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.DARK_GRAY);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int id = Integer.valueOf(idField.getText());
			String password = passwordField.getText();

			UserRepo repo = new UserRepo();
			boolean success=false;
			try {
				success = repo.authenticate(id, password);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			if(success==true) {
//				System.out.println("Login Successful!");
				LoginSuccessful.main(new String[]{});
			}
				
			if(success==false) {
//				System.out.println("Login failed!");
				LoginFail.main(new String[]{});
			}
			}
		});
		
//		contentPane.add(lblLogin);
		contentPane.add(lblId);
		contentPane.add(idField);
		contentPane.add(lblPassword);
		contentPane.add(passwordField);
		contentPane.add(btnNewButton);
	}
}
