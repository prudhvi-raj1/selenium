package com.gmail.testscript;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBlogin 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Sreekanth");
		driver.findElement(By.id("pass")).sendKeys("selenium");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();		
	}

}
