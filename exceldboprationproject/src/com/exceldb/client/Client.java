package com.exceldb.client;

import java.io.IOException;

import com.exceldb.writer.DBWriter;
import com.skynet.config.ConnectionFactory;

public class Client {

	public static void main(String[] args) throws IOException {
		new DBWriter().write(ConnectionFactory.getConnection()); 
	}
}
