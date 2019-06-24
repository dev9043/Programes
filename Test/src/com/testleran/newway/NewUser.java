package com.testleran.newway;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

@SuppressWarnings("serial")
public class NewUser extends JInternalFrame{

	Container c;

	public NewUser() {
		super("New User Detail", true, true, true, true);
		c = this.getContentPane();
		setVisible(true);
		c.setLayout(null);
		setBounds(200, 20, 650, 450);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
