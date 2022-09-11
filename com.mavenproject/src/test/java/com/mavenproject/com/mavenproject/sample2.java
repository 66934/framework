package com.mavenproject.com.mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample2 {

	public static void main(String[] args) throws IOException {
		
		File file=new File(System.getProperty("user.dir") + "\\TestData\\" + "Regression_TestData" + ".xlsx");
		FileInputStream inputStream=new FileInputStream(file);
		
		
		XSSFWorkbook wb=new XSSFWorkbook(inputStream);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(2);
		XSSFCell cell=row.getCell(0);
		
		String username=cell.getStringCellValue();
		System.out.println("User Name is :" + username );
		
		String password=cell.getStringCellValue();
		System.out.println("Password is :" + password);
		

	}

}
