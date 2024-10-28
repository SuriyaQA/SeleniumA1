package com.GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Action_Class_utlity extends WebDriver_Utility {

	Actions action;
	
	public Action_Class_utlity(WebDriver driver) {
	  action = new Actions(driver);
	}
	/**
	 * This method is used to move my cursor to the particular web element place
	 * @param element
	 * @return
	 */
	public Action_Class_utlity moveCursor(WebElement element) {
		
		action.moveToElement(element);
		
		return this;
	}
	/**
	 * Performs a context-click at the current mouse location. 
	 * @return 
	 */
	public Action_Class_utlity rightClick() {
		
		action.contextClick();
		
		return this;
	}
	/**
	 * Performs a context-click at middle of the given element.
	 *  First performs a mouseMove to the location of the element.
	 * @param element
	 * @return
	 */
	public Action_Class_utlity rightClick(WebElement element) {
		
		action.contextClick(element);
		return this;
	}
	/**
	 * Performs a double-click at the current mouse location.
	 * @return
	 */
	public Action_Class_utlity clickDouble() {
		
		action.doubleClick();
		
		return this;
	}
	/**
	 * this method is used to perform the double click on the web element 
	 * @param element
	 * @return
	 */
	public Action_Class_utlity clickDouble(WebElement element) {
		
		action.doubleClick(element);
		
		return this;
	}
	/**
	 * A convenience method that performs click-and-hold at the location of the source element,
	 *  moves to the location of the target element, then releases the mouse
	 * @param source
	 * @param destination
	 * @return
	 */
	public Action_Class_utlity pickAndPut(WebElement source,WebElement destination) {
		
		action.dragAndDrop(source, destination);
		
		return this;
	}
	/**
	 * A convenience method for performing the actions without calling build() first.
	 */
	public void doAction() {
		
		action.perform();
	}
}
