package org.getdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.print.DocFlavor.STRING;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetAlldata {


	public static void main (String []args) throws IOException {

		File f = new File("D:\\Details.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Sheet1");

		for (int i=0; i<sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

	for (int j=0; j<row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				switch (cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();	
					System.out.println(stringCellValue);

					break;

				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						String format = sdf.format(dateCellValue);
						System.out.println(format);
					}

					else {
						double numericCellValue = cell.getNumericCellValue();
						BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
						String string = valueOf.toString();
						System.out.println(string);
					}

					break;


				default:
					break;
				}

			}

			System.out.println();





		}









	}





}











