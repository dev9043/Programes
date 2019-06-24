package com.testleran;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Exem1 extends JFrame implements ActionListener  {

	private static final long serialVersionUID = 1L;
			
	private JButton b1,b2,b3,b4;
	
	public void setcomponent()
	{
		b1 = new JButton("vikash");
		b2 = new JButton("Devendra");
		b3 = new JButton("login");
		b4 = new JButton("Exit");
		
		b1.setBounds(50,50,100,100);
		b2.setBounds(300,50,100,100);
		b3.setBounds(50,200,100,100);
		b4.setBounds(300,200,100,100);
		
		setLayout(null);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
	public static void main(String[] args)
	{
		Exem1 jf = new Exem1();
		jf.setcomponent();

		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			System.out.print("vikash -> ");
			
		}
		
		if(e.getSource()==b2)
		{
			System.out.print("Devendra -> ");
		}
		
		if(e.getSource()==b3)
		{
			JOptionPane.showMessageDialog(null, "Hello vikash", "LoginWindow", 0);
			
		}
		
		if(e.getSource()==b4)
		{

			System.exit(0);
			
		}
		
	}
}