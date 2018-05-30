package com.gmail.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Isdisplayed {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.Facebook.com");
	WebElement objlogin=driver.findElement(By.xpath(".//*[@id='loginbutton']"));
	System.out.println(objlogin.isDisplayed()?"login is displayed":"login is not displayed");
		
	}

}
