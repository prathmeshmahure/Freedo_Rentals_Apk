
package com.utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public static XSSFWorkbook wb;
	public static FileInputStream fis;
	public static XSSFSheet excelSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	
	public ExcelDataProvider() throws Exception {

	
		String path=System.getProperty("user.dir")+"/src/test/resources/data/data1.xlsx";
		fis=new FileInputStream(path); 
		wb=new XSSFWorkbook(fis);
	}
	public String getstringdata(String sheetname,int row ,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	public double getnumericdata(String sheetname,int row ,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
	}
//==========================================================================================================
	public static String getCellValue(String fileName, String sheetName, int rowNo, int cellNo/*column no.*/)
	{
		try{
			fis = new FileInputStream(fileName);
			wb = new XSSFWorkbook(fis);
			excelSheet =  wb.getSheet(sheetName);
			cell = wb.getSheet(sheetName).getRow(rowNo).getCell(cellNo);
			wb.close();
			return cell.getStringCellValue();
		}
		catch (Exception e){
			return "";

				}
		}
//=========================================================================================================
	public static int getRowCount (String fileName, String sheetName)
	{ 
		try{
			fis = new FileInputStream(fileName);		//create XSSFWorkBook Class object for excel file manipulation
			wb = new XSSFWorkbook(fis);
			excelSheet =  wb.getSheet(sheetName);

			int ttlRows = excelSheet.getLastRowNum() + 1; //get total no. of rows

			wb.close();
			return ttlRows;
		}
		catch (Exception e){
			return 0;
		}
	}
//===========================================================================================================
	public static int getColCount (String fileName, String sheetName)
	{
		try{
			fis = new FileInputStream(fileName);
			
			wb = new XSSFWorkbook(fis);								//create XSSFWorkBook Class object for excel file manipulation
			excelSheet =  wb.getSheet(sheetName);
			
			int ttlCells = excelSheet.getRow(0).getLastCellNum(); //get total no. of columns
			wb.close();
			return ttlCells;
		}
		catch (Exception e)	{
			return 0;
			}

	}
//======================================================================================================================

}

