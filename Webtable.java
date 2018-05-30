package com.gmail.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable<webelements> 
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	WebElement table=driver.findelement(By.xpath(".//*[@id='main']/div[3]/div");
	List<webelements> rc=table.findElements(By.tagName("td");
	for(intj=0;j<cc.size();j++)
	{
		String text=cc.get(j).getText();
		System.out.println("text");
	}
	
	

}
