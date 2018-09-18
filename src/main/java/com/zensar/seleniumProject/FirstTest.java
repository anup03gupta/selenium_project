package com.zensar.seleniumProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class FirstTest {
	@Test
	public void test()  {
		  File file = new File("sample.properties");
		  
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			
			//load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	
			//WebDriver driver = new FirefoxDriver();

			driver.get(prop.getProperty("URL"));
			driver.findElement(By.id("login_field")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.name("commit")).click();
			driver.quit();
			
			//System.out.println("URL ::" + prop.getProperty("URL"));
			//System.out.println("User name::" +prop.getProperty("username"));
		    //System.out.println("Password::" +prop.getProperty("password"));
	  }
	}
