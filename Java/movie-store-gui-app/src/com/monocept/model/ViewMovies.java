package com.monocept.model;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ViewMovies extends JFrame {
	private JPanel contentPane;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMovies frame = new ViewMovies();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ViewMovies() throws SQLException {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		String data=null;
//		String column[]= null;
		
		MovieStore store = new MovieStore();
		data = store.getMovies();
		

//		System.out.println(d);
		
		JLabel lblName = new JLabel(data);
//		
		contentPane.add(lblName);
		
		
//		table = new JTable(data,column);
//		JScrollPane sp=new JScrollPane(table);
//		
//		contentPane.add(sp, BorderLayout.CENTER);
	}
}
