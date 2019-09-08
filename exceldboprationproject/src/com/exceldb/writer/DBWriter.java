package com.exceldb.writer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.exceldb.dto.Student;
import com.exceldb.reader.ExcelReader;
import com.exceldb.util.QueryConstant;

public class DBWriter implements Writer{

	@Override
	public void write(Connection connetion) throws IOException {
		List<Student> studentList = new ExcelReader().xlsxReader();
		if(connetion != null)
		{
			for(Student student : studentList)
			{
				//System.out.println(student);
				insertRecord(connetion,student);
			}
		}
	}

	public void insertRecord(Connection connetion,Student student) {
		try {
			PreparedStatement pstmt = connetion.prepareStatement(QueryConstant.INSERT_INTO_STUSENT);
			pstmt.setInt(1, student.getRollNumber());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getStdClass());
			pstmt.setDouble(4, student.getFee());
			pstmt.setInt(5, student.getAge());
			pstmt.setString(6, student.getCategory());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
