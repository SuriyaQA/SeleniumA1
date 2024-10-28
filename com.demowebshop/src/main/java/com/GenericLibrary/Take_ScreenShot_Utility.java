package com.GenericLibrary;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

public class Take_ScreenShot_Utility extends WebDriver_Utility {

	/**
	 * This method is used to take the screen shot of the webpage
	 * @throws IOException
	 */
	public static void takeErrorShot(String TestCase) throws IOException {

		String SystemDate = Java_Utility.date();

//		ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//
//		File destination = new File(Iconstant.Error_ShotPath);
//
//		Files.copy(source, destination);
		
		 ts  = (TakesScreenshot) driver;
		 
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\Suriy\\eclipse-workspace\\com.demowebshop\\ExtentReport\\Report"+SystemDate+".html");

		ExtentReports report = new ExtentReports();

		report.attachReporter(spark);

		com.aventstack.extentreports.ExtentTest test = report.createTest(TestCase);

		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64),"Screen Shot attached");

		report.flush();
		
		
	}
	
	/**
	 * This method is used to take the screen shot of webElement
	 * @param element
	 * @throws IOException
	 */
	public static void takeElementShot(WebElement element) throws IOException {
		
		String SystemDate = Java_Utility.date();
		
		File source = element.getScreenshotAs(OutputType.FILE);
		
		File destination = new File(SystemDate+""+ Iconstant.Element_shotPath);
		
		Files.copy(source, destination);
	}
}
