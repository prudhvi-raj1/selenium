package com.gmail.testscript;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gettitle 
{
	private static FirefoxDriver Webdriver;
	private static RemoteWebDriver driver;

	public static void main(String[]args)
	{
	Webdriver=new FirefoxDriver();
	driver.get("https://https://www.facebook.com");
	}
	//getting title from current page and
	//storing into title variable
		String title=driver.getTitle()
	if (title.equals("Facebook-login or Sign up"));
	{
		System.out.println(title+"is displayed");
	}
	else
	{
		System.out.println(title+ "is not displayed");
	}

}
