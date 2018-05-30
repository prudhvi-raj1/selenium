package com.gmail.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Countnooflinks {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://msn.com");
		driver.manage().window().maximize();
		List<WebElement> Objlist=driver.findElements(By.tagName("a"));
		System.out.println(Objlist.size());
		for(int i=0;i<Objlist.size();i++)
		{
			String text=Objlist.get(i).getText();
			System.out.println(text);
		}
	}

}
