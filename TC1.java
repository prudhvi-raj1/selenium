package com.gmail.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1 {

	

	public static void main(String[] args, String title) throws InterruptedException 
	{
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 title =driver.getTitle();
		if (title.equals("OrangeHRM"))
				{
					System.out.println(title +"is dispalyed");
				}
		WebElement objun=driver.findElementByXPath(".//*[@id='txtUsername']");
		WebElement objpwd=driver.findElementByXPath(".//*[@id='txtPassword']");
		WebElement objlogin=driver.findElementById("btnLogin");
		if (objun.isDisplayed()&objpwd.isDisplayed()&objlogin.isDisplayed())
		{
			System.out.println("username is available");
			System.out.println("password is available");
			System.out.println("login is available");
		}
		objun.clear();
		objpwd.clear();
		objun.sendKeys("Admin");
		objpwd.sendKeys("admin");
		title =driver.getTitle();
		if (title .equals("OrangeHRM"))
		{
			System.out.println(title +"Admin page is displayed");
		}
		String Weltext=driver.findElementByXPath(".//*[@id='welcome']").getText();
		if (Weltext.equals("Welcome Admin"))
		{
			System.out.println(Weltext+"is displayed");
		}
		Thread.sleep(3000);
		driver.findElementByXPath(".//*[@id='welcome']").click();
		driver.findElementByLinkText("logout").click();
		title =driver.getTitle();
		if (title .equals("OrangeHRM"))
		{
			System.out.println("logout is completed");
			System.out.println(title + "is displayed");
		}
		driver.close();
		System.out.println("object is close");
		driver.quit();
		System.out.println("quit the window");
		
		

	}

}
