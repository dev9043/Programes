package com.exceldb.reader;

import java.io.IOException;
import java.util.List;

import com.exceldb.dto.Student;

public interface Reader {

	public List<Student> xlsxReader() throws IOException;
}
