package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.GenericLibrary.Action_Class_utlity;
import com.GenericLibrary.Base_Class;

public class ActionClassTest extends Base_Class {

	@Test
	public void testCase() {

		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));

		Action_Class_utlity a = new Action_Class_utlity(driver);

		a.moveCursor(element).rightClick().doAction();
	}
}
