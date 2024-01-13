package datadrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelDataRead {
	@Test
	public void dataRead() throws IOException {
		File f1 = new File("./" + "\\TestData\\Data.xlsx");
		FileInputStream fs = new FileInputStream(f1);

		// wb-->sheet-->row-->cell-->data
		/*
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet1 = wb.getSheet("userdata"); // where user data is the sheet name given in excelsheet
		XSSFRow row1 = sheet1.getRow(1); 
		XSSFCell cell1 = row1.getCell(0);
		String value= cell1.getStringCellValue();
		System.out.println(value); //it will print Admin
		*/ // the above logic helpfull for single entry
		// we can write in one line also
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		// read single entry
//		String value=wb.getSheet("userdata").getRow(4).getCell(0).getStringCellValue();
//		System.out.println(value);
		
		// To read complete data from the file we make use of array
		 
		//first get no of rows then get no of columns 
		//then create array as per file size 
		//read data from file and save it in array
		
		// how to get no of rows
		
		int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
		System.out.println("number of rows are "+ rows);
		
		// how to get no of cells
		int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of columns are "+ cells);
		
		//then create array as per file size
		Object data[][]=new Object[rows][cells];
		
		//read data from file and save it in array
		
		for(int r=1; r<rows; r++) // starting array from row 1 by skipping heading username and password
		{
			for(int c=0; c<cells; c++)
			{
			data[r-1][c]=	wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
			System.out.println(data[r-1][c]);
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
