package com.satya.learning;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BC

{

	public static ExtentReports extent;
	public static ExtentTest test;

	public static String reportPath;

	@BeforeTest()
	public void setupReport() {

	
		reportPath = "C:\\TestNGResults\\hello.html";
		extent = new ExtentReports(reportPath, true);
		
	}

	@BeforeMethod()
	public void setup(Method method) {

		test = extent.startTest(method.getName(), method.getName());

	}

	@AfterMethod()
	public void close(Method method) {

		extent.endTest(test);
		extent.flush();
	}

	public static void reporter(ExtentTest test, String msg) {

		test.log(LogStatus.INFO, msg);
	}
}
