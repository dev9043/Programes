package com.test;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Sonu extends JFrame implements ActionListener {
	private static final long serialVersionUID = -7680761455541209253L;

	private JLabel userIdLabel, passwordLabel;

	private JTextField userIdTxtField;

	private JPasswordField passwordTxtField;

	private JButton loginButton, cencelButton;

	private Connection dbConnection;

	private Statement statement;

	private ResultSet resultSet;

	public Sonu() {
		Container container = this.getContentPane();

		initilizeCommonValues();
		initilizeUserIdFields();

		initilizePasswordField();
		initilizeButtons();
		setResizable(false);
		setLayout(null);
		createDbConnection();

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
		setVisible(true);
		getContentPane().setBackground(Color.GREEN);
		// setBackground();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void initilizePasswordField() {
		passwordLabel = new JLabel("PASSWORD");
		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		passwordLabel.setBounds(300, 200, 200, 30);
		passwordLabel.setVisible(true);
		passwordLabel.setForeground(Color.black);

		passwordTxtField = new JPasswordField();
		passwordTxtField.setBounds(450, 200, 150, 29);
		passwordTxtField.setToolTipText("PASSWORD");
		passwordTxtField.setFont(new Font("Times New Roman", Font.BOLD, 20));
	}

	private void initilizeUserIdFields() {

		userIdLabel = new JLabel("USER ID");
		userIdLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		userIdLabel.setBounds(300, 150, 150, 25);
		userIdLabel.setVisible(true);
		userIdLabel.setForeground(Color.black);

		userIdTxtField = new JTextField();
		userIdTxtField.setVisible(true);
		userIdTxtField.setBounds(450, 150, 150, 25);
		userIdTxtField.setToolTipText("USER ID");
		userIdTxtField.setFont(new Font("Times New Roman", Font.BOLD, 20));
	}

	private void initilizeButtons() {
		loginButton = new JButton("Login");
		loginButton.setBounds(300, 250, 100, 25);
		loginButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		loginButton.setForeground(Color.black);
		loginButton.addActionListener(this);
		loginButton.setMnemonic('u');
		loginButton.setToolTipText("click to continue");
		
		/*loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(statement != null)
				{
					try {
						resultSet = statement.executeQuery("SELECT * FROM USER_DETAIL");
						
						String userId = "";
						String password = "";
						String userIdFromUI = userIdTxtField.getText();
						String passwordFromUI = String.valueOf(passwordTxtField.getPassword());
						boolean isValidUser = false;
						while(resultSet.next())
						{
							userId = resultSet.getString("U_ID");
							password = resultSet.getString("U_PASSWORD");
							
							if(userId.equalsIgnoreCase(userIdFromUI) && password.equals(passwordFromUI))
							{
								isValidUser = true;
							}
						}
						if(isValidUser == true)
						{
							JOptionPane.showMessageDialog(null, "Welcome", "LoginWindow", 1);
							dispose();
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Invalid User Type/Password", "LoginWindow", 0);
							userIdTxtField.setText("");
							passwordTxtField.setText("");
						}
						
					} catch (SQLException ee) {
						ee.printStackTrace();
					}
				
			}

			}
		});
*/
		cencelButton = new JButton("Cancel");
		cencelButton.setForeground(Color.black);
		cencelButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		cencelButton.setBounds(450, 250, 100, 25);
		cencelButton.addActionListener(this);
		cencelButton.setMnemonic('c');
		cencelButton.setToolTipText("click to exit");
		
		/*cencelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}hyhyh
		});*/
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == loginButton) {
			
			if(statement != null)
			{
				try {
					resultSet = statement.executeQuery("SELECT * FROM USER_DETAIL");
					
					String userId = "";
					String password = "";
					String userIdFromUI = userIdTxtField.getText();
					String passwordFromUI = String.valueOf(passwordTxtField.getPassword());
					boolean isValidUser = false;
					while(resultSet.next())
					{
						userId = resultSet.getString("U_ID");
						password = resultSet.getString("U_PASSWORD");
						
						if(userId.equalsIgnoreCase(userIdFromUI) && password.equals(passwordFromUI))
						{
							isValidUser = true;
						}
					}
					if(isValidUser == true)
					{
						JOptionPane.showMessageDialog(null, "Welcome", "LoginWindow", 1);
						dispose();
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid User Type/Password", "LoginWindow", 0);
						userIdTxtField.setText("");
						passwordTxtField.setText("");
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}

		if (event.getSource() == cencelButton) {
			System.exit(0);
		}
	}

	private void createDbConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "skynet", "skynet");
			
			if(dbConnection != null)
			{
				statement = dbConnection.createStatement();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void main(String args[]) {

		new Sonu();
	}
}
