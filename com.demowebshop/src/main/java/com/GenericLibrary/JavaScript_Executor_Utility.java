package com.GenericLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScript_Executor_Utility extends WebDriver_Utility {

	/**
	 * This method is used to scroll up the webpage
	 * @param x-axis
	 * @param y-axis
	 */
	public static void scrollUp(int xaxis,int yaxis) {

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	}

/**
 * This method is used to scroll down the webpage
 * @param X-axis
 * @param y-axis
 */
	public static void scrollDown(int xaxis,int yaxis) {
		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy("+xaxis+","+ -yaxis +")");
	}
	
	/**
	 * This method is used to scroll Extreme top of the webpage
	 */
	public static void scrollTopWebpage() {
		
		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,document.body.scrollTop)");
	}
	
	/**
	 * This method is used to Extreme bottom of the webpage
	 */
	public static void scrollBottomWebpage() {
		
		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

	/**
	 * This method is used to scroll according to the webelement
	 * @param element
	 */
	public static void scrollTillWebElment(WebElement element) {
		
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
}
