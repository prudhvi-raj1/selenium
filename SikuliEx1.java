package com.gmail.testscript;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.api.Screen;
public class SikuliEx1 
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http:/opensource.demo.orangehrmlive.com/");
		Thread.sleep(4000);
		Screen s=new Screen();
		s.type("")
	}
}
