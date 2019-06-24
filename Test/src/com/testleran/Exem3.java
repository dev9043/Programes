package com.testleran;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Exem3 extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	private JTextField t1,t2,t3;
	private JButton b1,b2;
	
	public void setComponents()
	{
		
		t1=new JTextField();
		t1.setBounds(100,50,150,20);
		
		t2=new JTextField();
		t2.setBounds(100,100,150,20); 
		
		t3=new JTextField();
		t3.setBounds(100,150,150,20);
		
		b1=new JButton("get");
		b1.setBounds(70,220,100,20);
		b1.addActionListener(this);
		
		b2=new JButton("Cancel");
		b2.setBounds(200,220,100,20);
		b2.addActionListener(this);
		
		setLayout(null);
		
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
	}
	
	public static void main(String [] args)
	{
		Exem3 jf=new Exem3();
		jf.setComponents();
		jf.setVisible(true);
	    jf.setTitle("window");
		jf.setSize(400,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			t3.setText(t1.getText()+" "+b1.getText()+ " "+b2.getText()+" "+t2.getText());
			b1.setText(t1.getText());
			b2.setText(t2.getText());
			t1.setText("");
			t2.setText("");
		}
		
	if(e.getSource()==b2)
	{
		System.exit(0);
		
	}
	}
}
