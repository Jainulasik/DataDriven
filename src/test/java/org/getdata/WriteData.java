package org.getdata;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File("D:\\Book1.xlsx");
		
		Workbook book = new XSSFWorkbook();
		
		Sheet createSheet = book.createSheet("Info");

		
		Row createRow = createSheet.createRow(3);
		
		Cell createCell = createRow.createCell(1);
		Cell createCell2 = createRow.createCell(2);

		
		createCell.setCellValue("ASIAFI");
		createCell2.setCellValue("10/2/2022");
		
		FileOutputStream fis = new FileOutputStream(f);
		
		book.write(fis);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
