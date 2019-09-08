package com.exceldb.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.exceldb.dto.Student;
import com.exceldb.util.Constants;

public class ExcelReader implements Reader{

	@Override
	public List<Student> xlsxReader() throws IOException {
		
		List<Student> studentList = new ArrayList<>();

    	FileInputStream fis = new FileInputStream(Constants.FILE_NAME);

        // Finds the workbook instance for XLSX file
        XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
       
        // Return first sheet from the XLSX workbook
        XSSFSheet mySheet = myWorkBook.getSheetAt(0);
        
       
        // Get iterator to all the rows in current sheet
        Iterator<Row> rowIterator = mySheet.iterator();
       
        // Traversing over each row of XLSX file
       
       Row header = rowIterator.next();
        //System.out.println(header.getCell(0).getStringCellValue()+"    "+header.getCell(1).getStringCellValue()+"    "+header.getCell(2).getStringCellValue()+"    "+header.getCell(3).getStringCellValue()+"    "+header.getCell(4).getStringCellValue()+"    "+header.getCell(5).getStringCellValue());
        while (rowIterator.hasNext()) {
        	Student student= new Student();
            Row row = rowIterator.next();
            student.setRollNumber((int)row.getCell(0).getNumericCellValue());
            student.setName(row.getCell(1).getStringCellValue());
            student.setStdClass(row.getCell(2).getStringCellValue());
            student.setFee(row.getCell(3).getNumericCellValue());
            student.setAge((int)row.getCell(4).getNumericCellValue());
            student.setCategory(row.getCell(5).getStringCellValue());
            studentList.add(student);
        }
        myWorkBook.close();
    return studentList;
    
	}

	@Override
	public List<Student> read(Connection connetion) throws IOException 
	{
		return null;
	}
}
