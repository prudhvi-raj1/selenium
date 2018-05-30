package com.gmail.testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class Sample {

	public static void main(String[] args) 
	{
		// open firefox browser
		WebDriver driver=new FirefoxDriver();
		//loading URL into current browser
		driver.get("http://twitter.com");
	}

}
