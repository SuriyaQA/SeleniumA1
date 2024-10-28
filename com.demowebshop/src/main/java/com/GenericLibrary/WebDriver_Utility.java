package com.GenericLibrary;

import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {

	public static WebDriver driver;
	public static Properties pro;
	public static Workbook w;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	public static Actions action;
	
	/**
	 * This method is used to navigate to the particular url
	 * of the webpage
	 * @param url
	 */
	public static void navigateUrl(String url) {
		
		driver.get(url);
	}
	/**
	 * This method is used to maximize the browser
	 */
	public static void maximiseBrowser() {
		
		driver.manage().window().maximize();
	}
	/**
	 * This method is used to wait for the webelement to 
	 * load on the webpage 
	 */
	public static void loadTime() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Iconstant.Implicit_Wait));
	}
	/**
	 * This method is used to get the current url of the webpage
	 * @return
	 */
	public static String currentUrl() {
		
		return driver.getCurrentUrl();
	}
	/**
	 * This method is usedd to get the current title of the webpage
	 * @return
	 */
	public static String title() {
		
		return driver.getTitle();
	}
	/**
	 * This method is used to get the source code of the webpage
	 * @return
	 */
	public static String sourceCode() {
		return driver.getPageSource();
	}
	/**
	 * This method is used to get the current window address of the webpage
	 * @return
	 */
	public static String windowAdress() {
		
		return driver.getWindowHandle();				
	}
	/**
	 * This method is used to get all the window address of the webpage
	 * @return
	 */
	public static Set<String> allWindowAdress() {
		
		return driver.getWindowHandles();
	}
	/**
	 * This method is used to navigate to the particular url of the webpage
	 * @param url
	 */
	public static void navigateTo(String url) {
		
		driver.navigate().to(url);
	}
	/**
	 * This method is used to move backward of the webpage
	 */
	public static void moveBackward() {
		driver.navigate().back();
	}
	/**
	 * This method is used to go forward of the webpage
	 */
	public static void moveForward() {
		driver.navigate().forward();
	}
	/**
	 * This method is used to refresh the webpage
	 */
	public static void refreshPage() {
		driver.navigate().refresh();
	}
	/**
	 * This method is used to switch your control
	 *from one window to another window 
	 * @param Expected url
	 */
	public static void switchToWindow(String Expectedurl) {
		
		Set<String> all = driver.getWindowHandles();
		
		for(String s:all) {
			
			driver.switchTo().window(s);
			String Actualurl = driver.getCurrentUrl();
			
			if(Expectedurl.contains(Actualurl)) {
				break;
			}
			
		}
	}
	/**
	 * This method is used to switch your control from webpage to alert Box
	 * it will help you to click ok button in the Alert dialog box
	 */
	public static void switchToSimpleAlert() {
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
	}
	/**
	 * This method is used to switch your control from webpage to alert Box
	 * it will help you to click OK button or CANCEL Button in the Alert dialog box
	 * @param option
	 */
	public static void switchToConfirmationAlert(String option) {
		
		Alert alt = driver.switchTo().alert();
		
		if(option.contains("ok")) {
			alt.accept();
		}else {
			alt.dismiss();
		}
	}
	/**
	 * This method is used to switch your control from webpage to alert Box
	 * it will help you to send message in the Alert dialog box
	 * @param message
	 */
	public static void switchToPromptAlert(String message) {
		
		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys(message);
	}
	/**
	 * This method is used to switch your control from webpage to
	 * Iframe page with respective index
	 * @param index
	 */
	public static void switchToIframe(int index) {
		
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch your control from webpage to
	 * Iframe page with respective Id attribute or Name Attribute
	 * @param AttributeVale
	 */
	public static void switchToIframe(String AttributeVale) {
		driver.switchTo().frame(AttributeVale);
	}
	/**
	 * This method is used to switch your control from webpage to
	 * Iframe page with respective Webelement address
	 * @param element
	 */
	public static void switchToIframe(WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * This method is used to switch control from frame page to main page
	 */
	public static void switchBackMainFrame() {
		
		driver.switchTo().defaultContent();
	}
	/**
	 * This method is used to switch control from frame page to immediate page
	 */
	public static void switchBackImmediateParent() {
		
		driver.switchTo().parentFrame();
	}
}
