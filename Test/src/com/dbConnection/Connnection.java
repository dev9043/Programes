package com.dbConnection;


import java.sql.Connection;
import java.sql.DriverManager;

public class Connnection {

	private static Connection connection = null;

	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SKYNET", "skynet");
		} catch (Exception e) {
			System.out.println("Unable to connect database." + e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}
}
