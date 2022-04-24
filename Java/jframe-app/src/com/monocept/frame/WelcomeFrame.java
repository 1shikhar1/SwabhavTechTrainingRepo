package com.monocept.frame;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class WelcomeFrame {
	
	public WelcomeFrame() {
		this("Welcome");
	}
	
	public WelcomeFrame(String msg) {
		frame(msg);
	}
	
	public void frame(String msg) {
		JFrame f = new JFrame(msg);
		
		JButton b=new JButton("click"); 
		b.setBounds(200,100,200, 40); 
		          
		f.add(b);
		b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				
			            if(f.isBackgroundSet())
			            {
			            	f.getContentPane().setBackground(Color.ORANGE);
			            }
			        }  
			    }); 
		
		f.setSize(600,400);  
		f.setLayout(null);
		f.setVisible(true);
	}
}
