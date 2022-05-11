package com.async.test;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ASyncFrame extends JFrame {
	static ASyncFrame frame;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		frame = new ASyncFrame();
		frame.setVisible(true);
		
	}
	
	public ASyncFrame() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnPrint);
		
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					PrintTimeStamp stamp = new PrintTimeStamp();
					stamp.print();
			}
		});
		
		JButton btnHello = new JButton("Hello");
		btnHello.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnHello);
		
		btnHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Hello");
			}
		});
	}
}
