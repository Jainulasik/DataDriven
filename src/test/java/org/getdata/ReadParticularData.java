package org.getdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadParticularData {

	public static void main(String[] args) throws IOException {
		
		
		
		//DEFINE PARTICULAR DATA FROM EXCEL
		
		File f = new File("D:\\Username.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheet = w.getSheet("Sheet1");
		
		Row row = sheet.getRow(3);
		
		Cell cell = row.getCell(1);
		
		String stringCellValue = cell.getStringCellValue();
		
		System.out.println(stringCellValue);
		
        		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
