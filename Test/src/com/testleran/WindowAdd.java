package com.testleran;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowAdd extends JFrame {

	private static final long serialVersionUID = 9174064594421645325L;

	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3;
	JButton b1;

	//public WindowAdd() {
	//}

	//public WindowAdd(String s) {
		//super(s);
	//}

	public void setcomponent() {
		l1 = new JLabel("Addition of two number");
		l2 = new JLabel("First Number");
		l3 = new JLabel("Second Number");
		l4 = new JLabel();
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		b1 = new JButton("Add");

		setLayout(null);

		l1.setBounds(50, 50, 200, 20);
		l2.setBounds(50, 80, 100, 20);
		t1.setBounds(150, 80, 100, 20);
		l3.setBounds(50, 130, 100, 20);
		t2.setBounds(150, 130, 100, 20);
		b1.setBounds(85, 220, 80, 20);
		l4.setBounds(90, 180, 100, 20);
		t3.setBounds(80, 180, 100, 20);

		b1.addActionListener(new Handler());

		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(l4);
		add(t3);
	}

	class Handler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int s = a + b;
			l4.setText("Sum = " + s);
		}
	}

	public static void main(String[] args) {
		WindowAdd window = new WindowAdd();
		window.setcomponent();

		window.setSize(300, 300);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
