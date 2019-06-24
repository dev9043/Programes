package com.dbConnection;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UiWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JButton b1,b2;
	
  public void setComponents()
  {
	  b1 = new JButton("Receive");
	  b1.setBounds(50,50,100,100);
	  
	  b2 = new JButton("Update");
	  b2.setBounds(180,50,100,100);
	  
	  setLayout(null);
	  
	  add(b1);
	  add(b2);
	  
  }
	
	;
	public static void main (String [] args)
	{
		UiWindow jf = new UiWindow();
		jf.setSize(320,220);
		jf.setComponents();
		jf.setVisible(true);
		jf.setTitle("Window");
		jf.setResizable(false);
		jf.getContentPane().setBackground(Color.BLUE);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
