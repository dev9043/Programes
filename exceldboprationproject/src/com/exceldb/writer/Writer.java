package com.exceldb.writer;

import java.io.IOException;
import java.sql.Connection;

public interface Writer {

	public void write(Connection connetion) throws IOException;
}
