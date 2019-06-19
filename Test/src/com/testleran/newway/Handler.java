package com.testleran.newway;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Handler implements ActionListener {

	private JTextField t1,t2;
	private JLabel l4;
	
	public Handler(JTextField t1,JTextField t2,JLabel l4)
	{
	this.t1 = t1;
	this.t2 = t2;
	this.l4 = l4;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		double a = 0 ,b = 0,s;
		try
		{
		 a = Double.parseDouble(t1.getText());
		}
		catch (NumberFormatException xe)
		{
			JOptionPane.showMessageDialog(null, "Please Input only number", "LoginWindow", 0);
			t1.setText("");
		}
		try
		{
			 b = Double.parseDouble(t2.getText());
		}
		catch (NumberFormatException xe)
		{
			JOptionPane.showMessageDialog(null, "Please Input only number", "LoginWindow", 0);
			t2.setText("");
		}
		 s = a + b;
		l4.setText("Sum = " + s);
		
	}

	}

