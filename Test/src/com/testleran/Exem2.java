package com.testleran;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Exem2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JTextField t1,t2;
	private JButton b1,b2;
	
	public void setComponent()
	{
	t1=new JTextField();
	t1.setBounds(100,70,150,20);
	
	t2=new JTextField();
	t2.setBounds(100,120,150,20);
	
	b1=new JButton("Get");
	b1.setBounds(70,170,100,20);
	b1.addActionListener(this);
	
	b2=new JButton("Cancel");
	b2.setBounds(200,170,100,20);
	b2.addActionListener(this);
	
	setLayout(null);
	
	
	add(t1);
	add(t2);
	add(b1);
	add(b2);
	
	}
	public static void main(String [] args)
	{
		Exem2 jf=new Exem2();
		jf.setComponent();
		
		jf.setVisible(true);
		jf.setSize(400,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			t2.setText(t1.getText());
			t1.setText("");
			
		}
		
		if(e.getSource()==b2)
		{
			System.exit(0);
			
		}
		
	}
}
