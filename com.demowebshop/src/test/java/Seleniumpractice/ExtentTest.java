package Seleniumpractice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTest {

	@Test
	public void testCase() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		TakesScreenshot ts  = (TakesScreenshot) driver;


		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\Suriy\\eclipse-workspace\\com.demowebshop\\ExtentReport\\Report.html");

		ExtentReports report = new ExtentReports();

		report.attachReporter(spark);

		com.aventstack.extentreports.ExtentTest test = report.createTest("testCase");

		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64),"Screen Shot attached");

		report.flush();
	}
}
