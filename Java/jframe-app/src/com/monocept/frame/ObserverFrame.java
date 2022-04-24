package com.monocept.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.monocept.listener.DevilListener;
import com.monocept.listener.GodListener;

public class ObserverFrame extends JFrame{
	
	public void displayFrame() {
		JFrame f = new JFrame();
		
		JButton b=new JButton("click"); 
		b.setBounds(200,100,200, 40); 
		          
		f.add(b);
		b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					new GodListener().listen();
					new DevilListener().listen();
				
			        }  
			    }); 

		f.setSize(600,400);  
		f.setLayout(null);
		f.setVisible(true);
	}

}
