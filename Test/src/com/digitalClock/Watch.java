package com.digitalClock;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Watch extends JFrame  {

	private static final long serialVersionUID = -4371479559572649617L;
	
	
	JLabel jlabClock;
	WatchThread ct;
	
	
	public Watch()
	{
		jlabClock = new JLabel("");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jlabClock.setFont(new Font("Comic Sans Ms",Font.BOLD,25));
		add(jlabClock);
		setSize(430,100);
		setLocationRelativeTo(null);
		ct = new WatchThread(this);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Watch();
	}
}

