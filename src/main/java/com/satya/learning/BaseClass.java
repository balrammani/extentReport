package com.satya.learning;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass {

	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static String reportPath;
	
	@BeforeTest()
	public void setupReport() {
	
		String currentDate = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
		String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		reportPath = "C:\\SatyaFriendResults\\" + currentDate + "\\" + timeStamp + ".html";		
		extent = new ExtentReports(reportPath, true);
		extent.addSystemInfo("Host Name", System.getProperty("os.name").toLowerCase());
			
	}
	
	@BeforeMethod()
	public void setup(Method method){		
		
		test = extent.startTest(method.getName(), method.getName());
		
	}
	
	@AfterMethod()
	public void close(Method method){
		
		extent.endTest(test);
		extent.flush();
		
	}
	
	
	public static void reporter(ExtentTest test, String msg){
		test.log(LogStatus.INFO, msg);
	}
	
}
