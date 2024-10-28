package Seleniumpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericLibrary.Base_Class;

public class Program4Test extends Base_Class {

	@Test
	public void testCase() {
		
		Reporter.log(currentUrl(),true);
		Reporter.log(title(),true);
	}
}
