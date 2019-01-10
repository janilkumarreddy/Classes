package com.demo.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilByPOI {
	
	public void readExcel(String xlPath,String sheetName) throws IOException {
		
		XSSFWorkbook wb= new XSSFWorkbook(xlPath);
		XSSFSheet sheet = wb.getSheet(sheetName);
		
		System.out.println(wb.getSheetIndex(sheetName));//To know the index of sheet by sheet name
		
		
		
		//Below code will directly read cell data from first row first col
		/*XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);		
		System.out.println(cell);*/
		
		//Below code will read the data from entrire sheet
		int rowCount = sheet.getLastRowNum(); // Will return last row num which starts index from 0, sowe haveto consider totalRows=lastRowNum+1(Ex : If sheet has 5 rows it will return 4)
		int colCount = sheet.getRow(0).getLastCellNum();//will return total number of columns in row. This will return actual number of columns.i.e. If sheet has 5 columns, will return 5, not like getLatRowNum like above)
		System.out.println("Total rows : "+rowCount);
		System.out.println("Total cols : "+colCount);
		
		for(int i=0 ; i <= rowCount;i++) {			
			XSSFRow row = sheet.getRow(i);
			for(int j=0 ; j < colCount;j++) {				
				XSSFCell cell = row.getCell(j);
				System.out.print(cell.toString()+" ");
			}		
			System.out.println();
		}
		
		wb.close();
		
		
	}

	
	public static void main(String args[]) throws IOException {
		ExcelUtilByPOI obj = new ExcelUtilByPOI();
		obj.readExcel(System.getProperty("user.dir")+"\\TestData\\GlobalTestData.xlsx", "TestCases");
	}
}
