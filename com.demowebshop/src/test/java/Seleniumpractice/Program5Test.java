package Seleniumpractice;

import org.testng.annotations.Test;

import com.GenericLibrary.Base_Class;
import com.PomScript.WelcomePage;

public class Program5Test extends Base_Class {

	@Test
	public void testCase() {
		
		WelcomePage w = new WelcomePage(driver);
		
		w.regLink.click();
	}
}
