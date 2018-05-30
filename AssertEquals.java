package com.gmail.testscript;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssertEquals {
	public void demoAE(TimeUnit SECONDS)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20, SECONDS);
		assertEquals(driver.getTitle(),"orangehrm12");
		System.out.println("condition is true");
		
	
	}



}
