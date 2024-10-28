package com.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Suriy
 */
public class Excel_File_Utility extends WebDriver_Utility {

	/**
	 * This method is used to fetch the Single data from Excel Sheet
	 * @param sheet
	 * @param row
	 * @param column
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static String excel_Data(String sheet,int row,int coloumn) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(Iconstant.Excel_FilePath);
		w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(coloumn);
		String result = c.getStringCellValue();
		return result;
	}
	/**
	 * This method is used to return the total number
	 * of row present in particular excel sheet
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static int rowSize(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Iconstant.Excel_FilePath);
		w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		return s.getPhysicalNumberOfRows();
		
	}
	/**
	 * This method is used to return the total number
	 * of Column present in particular excel sheet
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static int columnSize(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Iconstant.Excel_FilePath);
		w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		 Row r = s.getRow(0);
		return r.getPhysicalNumberOfCells();
		
	}
	/**
	 * This method is used to Fetch all the data in the Excel sheet
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static Object[][] excelAllData(String sheet) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(Iconstant.Excel_FilePath);
		w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		Object[][] data = new Object[rowSize(sheet)][columnSize(sheet)];
		for(int i=0;i<rowSize(sheet);i++) {
			for(int j=0;j<columnSize(sheet);j++) {
				
				data[i][j] = s.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return data;
	}
}
