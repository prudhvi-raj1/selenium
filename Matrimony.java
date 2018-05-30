package com.gmail.testscript;

import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Matrimony {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.telugumatrimony.com/");
		driver.manage().window().maximize();
		driver.findElement(ByLinkText("menusearchoption")).click();
		driver.findElement(ByXPath(".//*[@id='NAME']")).Sendkeys("prudhvi");
		driver.findElement(ByXpath(".//*[@id='DOBDAY']")).click();
	webelement Rdd1=driver.findElement(ByXpath)
		
		

	}

}
