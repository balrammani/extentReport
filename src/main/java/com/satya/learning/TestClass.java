package com.satya.learning;

import org.testng.annotations.*;
public class TestClass extends BaseClass

 { 
	
	
	@Test(priority=0)	
	public void firstMethod() 
	{
		System.out.println("FirstMethod");
		reporter(test,"This is First Method;");
	}
	
	@Test(priority=1)
	public void SecondMethod() 
	{
		System.out.println("SecondMethod");
		reporter(test,"This is Second Method;");
	}
}
