package com.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExtraction {

	 public static String dataEx(String sheet, int rownum, int colnum) throws IOException {
		 File f = new File("C:\\Users\\Admin\\Desktop\\Data.xlsx");
		 FileInputStream fis = new FileInputStream(f);
		 Workbook w = new XSSFWorkbook(fis);
		 Sheet s =  w.getSheet(sheet);
		 Row r=s.getRow(rownum);  //0 or 1 inside the bracket. these are index
		 Cell c=r.getCell(colnum); //0 or 1 or 2
		 CellType ct = c.getCellType();
		 
		 if(ct.equals(ct.STRING)) {
			// System.out.println(c.getStringCellValue());
			 String s1=c.getStringCellValue();
			 return s1;
		 }
		 else {
			// System.out.println(c.getNumericCellValue());
			 double d=c.getNumericCellValue();
			 int e=(int)d;
			 String s1=String.valueOf(e);
			 return s1;
			 
		 }
	}
}
