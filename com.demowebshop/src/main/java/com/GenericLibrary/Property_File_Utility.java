package com.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_File_Utility extends WebDriver_Utility {

	public static String propertyData(String Key) throws IOException {
		
		FileInputStream fis = new FileInputStream(Iconstant.Property_FilePath);
		pro = new Properties();
		pro.load(fis);
		return pro.getProperty(Key);
	}
}
