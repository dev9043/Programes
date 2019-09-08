package com.exceldb.reader;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import com.exceldb.dto.Student;

public interface Reader {

	public List<Student> xlsxReader() throws IOException;
	public List<Student> read(Connection connetion) throws IOException;
}
