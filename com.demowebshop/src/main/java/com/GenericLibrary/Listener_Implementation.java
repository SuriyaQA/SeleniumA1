package com.GenericLibrary;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener_Implementation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test Excecution started",true);
		
		result.getName();
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Execution success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Execution failed",true);
		String TestCase = result.getName();//it will give failed testcase method name
		try {
			Take_ScreenShot_Utility.takeErrorShot(TestCase);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
}
