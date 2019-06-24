package com.SimpalCalcutator;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginWindow extends JFrame implements ActionListener
{ 
	private static final long serialVersionUID = 1L;
	
	private JLabel l1,l2;
	private JTextField t1;
	private JPasswordField t2;
	private JButton b1,b2;
	private JDesktopPane dt;
	
	
public void setcomponents()
{
	dt = new JDesktopPane();
	setContentPane(dt);
	l1=new JLabel("User Id");
	l2=new JLabel("Passwad");
	t1=new JTextField();
	t2=new JPasswordField();
	b1=new JButton("Login");
	b2=new JButton("Exit");

	l1.setBounds(500,200,100,20);
	t1.setBounds(600,200,150,20);
	l2.setBounds(500,250,100,20);
	t2.setBounds(600,250,150,20);
	b1.setBounds(500,320,100,20);
	b2.setBounds(650,320,100,20);
	
	b1.setMnemonic('l');
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	setLayout(null);
	
	add(t1);
	add(t2);
	add(b1);
	add(b2);
	add(l1);
	add(l2);
	
}

@Override
public void actionPerformed(ActionEvent e)
{
	if(e.getSource() == b1)
	{
		t1.setText("dev");
	t2.setText("dev");
		if(t1.getText().equals("") && new String(t2.getPassword()).equals(""))
		{
			JOptionPane.showMessageDialog(null, "Please enter user name and password", "LoginWindow", 0);
		}
		else if("DEV".equalsIgnoreCase(t1.getText()) && "dev".equals(new String(t2.getPassword())))
		{
			CalculatorWindow ex = new CalculatorWindow(b1,b2);
			dt.add(ex);
			try {
				ex.setSelected(true);
			} catch (PropertyVetoException j) {
			}
			t1.setText("");
			t2.setText("");
			b1.setEnabled(false);
			b2.setEnabled(false);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid User name or password", "LoginWindow", 0);
			t1.setText("");
			t2.setText("");
		}
	}
	if(e.getSource()==b2)
	{
		System.exit(0);
		
	}
}


	public static void main(String [] args)
	{
	LoginWindow jf=new LoginWindow();
	jf.setcomponents();
	jf.getContentPane().setBackground(Color.LIGHT_GRAY);
	jf.setTitle("Calculater Window");
	jf.setSize(1370,784);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	 
}
