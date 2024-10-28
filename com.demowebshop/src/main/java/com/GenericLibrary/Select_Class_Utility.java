package com.GenericLibrary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_Class_Utility  {

	Select select;

	public Select_Class_Utility(WebElement element) {

		select = new Select(element);
	}

	
	/**
	 * This method is used to select the option which present in the dropdown
	 * with respect to index value
	 * @param index
	 */
	public  void Index(int index) {

		select.selectByIndex(index);
	}
	
	
	/**
	 * This method is used to select the option which present in the dropdown
	 * with respect to  val Attribute
	 * @param value
	 */
	public void value(String value) {
		
		select.selectByValue(value);
	}
	/**
	 * This method is used to select the option which present in the dropdown
	 * with respect to Text Function
	 * @param element
	 */
	public void text(String text) {

		select.selectByVisibleText(text);
	}
	/**
	 * This method is used to De-select the option which present in the dropdown
	 * with respect to indexing value
	 * @param index
	 */
	public void deselectIndex(int index) {
		select.deselectByIndex(index);
	}
	/**
	 * This method is used to De-select the option which present in the dropdown
	 * with respect to Attribute value
	 * @param value
	 */
	public void deselectValue(String value) {
		select.deselectByValue(value);
	}
	/**
	 * This method is used to De-select the option which present in the dropdown
	 * with respect to Text Function value
	 * @param text
	 */
	public void deselectText(String text) {
		select.deselectByVisibleText(text);
	}
	/**
	 * This method is used to give you the first selected
	 * option present in the drop down
	 * @return
	 */
	public WebElement getFirstSelect() {
		WebElement element = select.getFirstSelectedOption();
		return element;
	}
	/**
	 * This method is used to give you all the selected option
	 * which present in the drop down
	 * @return
	 */
	public List<WebElement> getAllSelect() {
		List<WebElement> allElement = select.getAllSelectedOptions();
		return allElement;
	}
	/**
	 * This method is used to get all the Option which presen 
	 * in the drop down
	 * @return
	 */
	public List<WebElement> getAllOption() {
		List<WebElement> allOption = select.getOptions();
		return allOption;
	}
	/**
	 * This method is used to return the size of the drop down
	 * @return
	 */
	public int Size() {
		int size = select.getOptions().size();
		return size;
	}
	/**
	 * This method is used to de-select all the option
	 * which present in the drop down
	 */
	public void clear() {
		select.deselectAll();
	} 
	/**
	 * This method is used to check weather it is multi select 
	 * drop down or not
	 * @return
	 */
	public boolean isMultiSelect() {
		boolean b = select.isMultiple();
		return b;
	}
}

