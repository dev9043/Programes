package com.test;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jyoti extends JFrame 
{

	private static final long serialVersionUID = -4751318815255617226L;
	
	private JLabel l1;
	
	public void setcomponents()
	{
		l1=new JLabel("Himanshu pandit");
		l1.setBounds(200, 200, 300, 40);
		
		setLayout(null);	
		add(l1);
	}
	
	
	public static void main (String [] args)
	{
		Jyoti jy = new Jyoti();
		jy.setcomponents();
		jy.setSize(500,500);
		jy.setVisible(true);
		jy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jy.getContentPane().setBackground(Color.WHITE);
		jy.setResizable(false);		
				
	}
}