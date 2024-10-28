package Seleniumpractice;

import org.testng.annotations.Test;

import com.GenericLibrary.Base_Class;
import com.GenericLibrary.JavaScript_Executor_Utility;

public class ProgramJsTest extends Base_Class {

	@Test
	public void testCase() {
		
		JavaScript_Executor_Utility.scrollBottomWebpage();
		JavaScript_Executor_Utility.scrollTopWebpage();
	}
	
}
