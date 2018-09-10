package com.satya.learning;

import org.testng.annotations.Test;

public class NewTest extends BC {

	@Test(priority = 0)
	public void firstMethod() {
		System.out.println("FirstMethods");
		reporter(test, "This is First Method");
	}

	@Test(priority = 1)
	public void SecondMethod() {
		System.out.println("SecondMethod");
		reporter(test, "This is Second Method");

	}

}
