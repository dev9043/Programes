package com.test;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Dev extends JFrame implements Runnable, ActionListener {

	private static final long serialVersionUID = -7680761455541209253L;

	private JLabel userIdLabel, passwordLabel;
	private JTextField userIdTxtField;
	private JPasswordField passwordTxtField;

	private JButton loginButton, cencelButton;

	public Dev() {

		Container container = this.getContentPane();

		initilizeCommonValues();

		initilizeUserIdFields();

		initilizePasswordField();

		initilizeButtons();

		setResizable(false);

		addContentOnContainer(container);

	}

	private void addContentOnContainer(Container container) {

		container.add(userIdLabel);
		container.add(userIdTxtField);
		container.add(passwordLabel);
		container.add(passwordTxtField);

		container.add(loginButton);
		container.add(cencelButton);

	}

	private void initilizeCommonValues() {

		setVisible(true);

		setTitle("LOGIN WINDOW");

		setBounds(110, 70, 800, 500);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// checkDbConnecton();
	}

	private void initilizeButtons() {
		loginButton = new JButton("Login");
		loginButton.setBounds(250, 405, 100, 25);
		loginButton.setForeground(Color.red);
		loginButton.addActionListener(this);
		loginButton.setMnemonic('u');
		loginButton.setToolTipText("click to continue");

		cencelButton = new JButton("Cancel");
		cencelButton.setForeground(Color.red);
		cencelButton.setBounds(390, 405, 100, 25);
		cencelButton.addActionListener(this);
		cencelButton.setMnemonic('c');
		cencelButton.setToolTipText("click to exit");
	}

	private void initilizePasswordField() {
		passwordLabel = new JLabel("PASSWORD");
		passwordLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 20));
		passwordLabel.setBounds(230, 320, 150, 50);
		passwordLabel.setVisible(true);
		passwordLabel.setForeground(Color.yellow);

		passwordTxtField = new JPasswordField("singh");
		passwordTxtField.setBounds(375, 327, 160, 29);
		passwordTxtField.setToolTipText("PASSWORD");
		passwordTxtField.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		// t2.addKeyListener(this);
	}

	private void initilizeUserIdFields() {

		userIdLabel = new JLabel("USER ID");
		userIdLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 20));
		userIdLabel.setBounds(230, 260, 150, 50);
		userIdLabel.setVisible(true);
		userIdLabel.setForeground(Color.yellow);

		userIdTxtField = new JTextField("Devendra");
		userIdTxtField.setVisible(true);
		userIdTxtField.setBounds(375, 268, 160, 29);
		userIdTxtField.setToolTipText("USER ID");
		userIdTxtField.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
	}

	/*
	 * public void keyPressed(KeyEvent ke) { if(ke.getSource()==t2) {
	 * if(ke.getKeyChar()=='\n') { parent h=new parent(); dispose(); } } }
	 */

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == loginButton) {
			Lovely loginProcessor = new Lovely(userIdTxtField, passwordTxtField);
			Thread loginProcessorThread = new Thread(loginProcessor);
			loginProcessor.setStartLoginProcess(true);
			loginProcessorThread.start();
		}
		if (event.getSource() == cencelButton) {
			System.exit(0);
		}

		/*
		 * if(ae.getSource()==change) { changepass obj=new changepass(); }
		 */
	}

	public static void main(String args[]) {
		new Dev();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
