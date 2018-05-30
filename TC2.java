package com.gmail.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource.demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20, SECONDS);
		String.title=driver.getTitle();
		if(title.equals("orangeHRM"))
		{
			System.out.println(title+"is displayed");
		}
		WebElement objun=driver.findElement(By.Xpath(".//*[@id='txtUsername']")
		WebElement objpwd=driver.findElement(ByXPath(".//*[@id='txtPassword']");
		WebElement objlogin=driver.findElementById("btnLogin");
		if (objun.isDisplayed()&objpwd.isDisplayed()&objlogin.isDisplayed();
		{
			System.out.println("username is available");
			System.out.println("password is available");
			System.out.println("login is available");
		}
		objun.clear();
		objpwd.clear();
		objun.sendKeys("Admin");
		objpwd.sendKeys("admin");
		objlogin.click();
		title=driver.getTitle();
		if (title.equals("OrangeHRM"))
		{
			System.out.println(title+"Admin page is displayed");
		}
		WebElement.Objpim=driver.findElement(ByXpath)

}
