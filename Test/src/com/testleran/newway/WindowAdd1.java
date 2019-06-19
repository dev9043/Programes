package com.testleran.newway;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class WindowAdd1 extends JFrame {

	private static final long serialVersionUID = 9174064594421645325L;

	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3;
	JButton b1,b2;

	public void setcomponent() {
		l1 = new JLabel("Addition of two number");
		l2 = new JLabel("First Number");
		l3 = new JLabel("Second Number");
		l4 = new JLabel();
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		b1 = new JButton("Add");
		b2 = new JButton("Exit");

		setLayout(null);

		l1.setBounds(50, 50, 200, 20);
		l2.setBounds(50, 80, 100, 20);
		t1.setBounds(150, 80, 100, 20);
		l3.setBounds(50, 130, 100, 20);
		t2.setBounds(150, 130, 100, 20);
		l4.setBounds(90, 180, 100, 20);
		t3.setBounds(80, 180, 100, 20);
		b1.setBounds(60, 220, 80, 20);
		b2.setBounds(160, 220, 80, 20);
		
		b1.addActionListener(new ActionListener() {
			
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
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(b2);
		add(l4);
		add(t3);
	}
	
	public static void main(String[] args) {
		WindowAdd1 window = new WindowAdd1();
		window.setcomponent();
		 
		window.setSize(300, 300);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
