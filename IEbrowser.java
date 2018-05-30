package com.gmail.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IEbrowser {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.iedriver","D:/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://facebook.com");
	}

}
