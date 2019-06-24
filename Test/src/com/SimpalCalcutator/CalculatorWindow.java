package com.SimpalCalcutator;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.border.Border;

public class CalculatorWindow extends JInternalFrame implements ActionListener{
   
	private static final long serialVersionUID = 1L;
	
	private JButton b1,b2,b3,b4,b5,b6;
	private JDesktopPane dt;
	private JButton login,exit;
	
	public CalculatorWindow(JButton login,JButton exit)
	{
		this.login = login;
		this.exit = exit;
		dt = new JDesktopPane();
		setContentPane(dt);
		setSize(500,550);
		setTitle("Calculator Window");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b4=new JButton("/");
		b5=new JButton("%");
		b6=new JButton("C");
		
		b1.setBackground(Color.YELLOW);
		b1.setFont(new Font("Showcard Gothic", Font.BOLD, 25));
		
		b1.setBounds(100,50,100,100);
		b2.setBounds(250,50,100,100);
		b3.setBounds(100,200,100,100);
		b4.setBounds(250,200,100,100);
		b5.setBounds(100,350,100,100);
		b6.setBounds(250,350,100,100);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		setLayout(null);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		this.getContentPane().setBackground(Color.WHITE);
		
	}
	/*public static void main (String[]args)
	{
		new CalculatorWindow();
				
	}*/

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			Addition ex = new Addition();
			dt.add(ex);
			try {
				ex.setSelected(true);
			} 
			catch (PropertyVetoException j)
			{
			}
		}
		
		if(e.getSource()==b2)
		{
			Subtraction su=new Subtraction();
			dt.add(su);
			try
			{
				su.setSelected(true);
			}
			catch(PropertyVetoException j)
			{
				
			}
		}
		
		if(e.getSource()==b3)
		{
			Multiplication mu=new Multiplication();
			dt.add(mu);
			try
			{
				mu.setSelected(true);
			}
			catch(PropertyVetoException j)
			{
				
			}
		}
					
		if(e.getSource()==b4)
		{
			Divide di=new Divide();
			dt.add(di);
			try
			{
				di.setSelected(true);
			}
			catch(PropertyVetoException j)
			{
				
			}
		}
		
		if(e.getSource()==b5)
		{
			Percentage pe=new Percentage();
			dt.add(pe);
			try
			{
				pe.setSelected(true);
			}
			catch(PropertyVetoException j)
			{
				
			}
		}
		if(e.getSource()==b6)
		{
			this.dispose();
			login.setEnabled(true);
			exit.setEnabled(true);
		}
	}
	
}
