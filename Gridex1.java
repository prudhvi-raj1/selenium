package com.gmail.testscript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gridex1 
{
	WebDriver Driver;
	String BaseURL;
	String NodeURL;
	DesiredCapabilities Capability;
	@BeforeTest
	public void Setup() throws MalformedURLException
	{
		BaseURL="http://opensource.demo.orangehrmlive.com/";
		NodeURL="http://192.168.100.5:4444/wd/hub/";
		Capability=DesiredCapabilities.firefox();
		Capability.setBrowserName("firefox");
		Capability.setPlatform(Platform.ANY);
		Driver=new RemoteWebDriver(new URL(NodeURL),Capability);
	}
	@Test
	public Application Access2()
	{
		Driver.get(BaseURL);
		Driver.findElement(By.name("txt username")).sendKeys("Admin");
		Driver.findElement(By.name("txt password")).sendKeys("Admin");
		Driver.findElement(By.name("submit")).click();
	}
	@AfterTest
	public void closeApp()
	{
		Driver.quit();
	}
	
	

}

