package com.GenericLibrary;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(Listener_Implementation.class)
public class Base_Class extends WebDriver_Utility {

	@BeforeSuite
	public void connectToServer() {
		Reporter.log("Connection to the server",true);
	}
	@BeforeTest
	public void connectToDB() {
		Reporter.log("Connection to the data base",true);
	}
	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		maximiseBrowser();
		loadTime();
		String url = System.getProperty("url");
		navigateUrl(url);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Log out",true);
	}
	@AfterClass
	public void closeBrowser() {
		//driver.quit();
	}
	@AfterTest
	public void disconnectToDB() {
		Reporter.log("Disconnection to the DataBase",true);
	}
	@AfterSuite
	public void disconnectToServer() {
		Reporter.log("Disconnection to the Server",true);
	}
}
