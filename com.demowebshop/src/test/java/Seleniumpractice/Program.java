package Seleniumpractice;

import java.io.IOException;

import com.GenericLibrary.Excel_File_Utility;
import com.GenericLibrary.Property_File_Utility;

public class Program {

	public static void main(String[] args) throws IOException {
		
		System.out.println(Property_File_Utility.propertyData("url"));
		
		System.out.println(Excel_File_Utility.excel_Data("Sheet1", 0, 0));
		
		System.out.println(Excel_File_Utility.rowSize("Sheet1"));
	}
}
