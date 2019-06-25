package com.dbConnection;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;


public class Excel {

	private static final String FILE_NAME = "C:/Users/DEVMAX/Desktop/EXCEL_LEARN/STUDENT_DET.xlsx";
	
	    public static void main(String[] args) throws IOException {
	    	FileInputStream fis = new FileInputStream(FILE_NAME);

            // Finds the workbook instance for XLSX file
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
           
            // Return first sheet from the XLSX workbook
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
           
            // Get iterator to all the rows in current sheet
            Iterator<Row> rowIterator = mySheet.iterator();
           
            // Traversing over each row of XLSX file
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                // For each row, iterate through each columns
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {

                    Cell cell = cellIterator.next();

                    switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    default :
                 
                    }
                }
                System.out.println("");
            }
            myWorkBook.close();
	    }
	
}
