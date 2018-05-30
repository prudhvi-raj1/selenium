package com.gmail.testscript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) 
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		WebElement objun=driver.findElement(By.xpath(".//*[@id='txtUsername']"));
		assertTrue(objun.isDisplayed());
		System.out.println("username is displayed");
	}

	

}
