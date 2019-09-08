package com.exceldb.reader;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.exceldb.dto.Student;
import com.exceldb.util.QueryConstant;

public class DBReader implements Reader{

	@Override
	public List<Student> xlsxReader() throws IOException {
		return null;
	}

	@Override
	public List<Student> read(Connection connetion) throws IOException {

		
		List<Student> studentList = new ArrayList<>();
		if(connetion != null)
		{
			studentList = showRecord(connetion);
		}
		return studentList;
	}
	public List<Student> showRecord(Connection connection)
	{
		List<Student> studentList = new ArrayList<>();
		try{
		
		Statement stmt =connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet record = stmt.executeQuery(QueryConstant.SELECT_FROM_STUDENT);
		while(record.next())
		{
			Student student = new Student();
			student.setRollNumber(record.getInt(1));
			student.setName(record.getString(2));
			student.setStdClass(record.getString(3));
			student.setFee(record.getDouble(4));
			student.setAge(record.getInt(5));
			student.setCategory(record.getString(6));
			studentList.add(student);
		}
	} catch (SQLException e) {
	}
		return studentList;
	}

}
