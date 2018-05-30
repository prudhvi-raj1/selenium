package com.gmail.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelected {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.telugumatrimony.com/");
		driver.manage().window().maximize();
		WebElement Objterm=driver.findElement(By.xpath(".//*[@id='NAME']"));
		if (Objterm.isSelected())
		{
			Objterm.click();
		}
		else
		{
			Objterm.click();
		}
		driver.close();

	}

}
