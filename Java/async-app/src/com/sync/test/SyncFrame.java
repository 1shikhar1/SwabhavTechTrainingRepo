package com.sync.test;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SyncFrame extends JFrame {
	static SyncFrame frame;
	private JPanel contentPane;
	
	public SyncFrame() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnPrintButton = new JButton("Print");
		btnPrintButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnPrintButton);
		
		btnPrintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				while(true) {
					System.out.println(java.time.LocalDateTime.now());
				}
			}
		});
		
		JButton btnHelloButton = new JButton("Hello");
		btnHelloButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnHelloButton);
		
		btnHelloButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Hello");  
			}
		});
	}
}
