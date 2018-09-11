package com.test;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { FirstTest.class });
		testng.addListener(tla);
		testng.run();
		}
}
