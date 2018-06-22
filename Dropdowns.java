package com.gmail.testscript;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Dropdowns {

	private static FirefoxProfile fp;

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxDriver Profiles fp=pr.getProfile("onlineqaclass");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		driver.findElementById("ct100-maincontent-dd1-Adult");
		driver.findElementById("ct100-maincontent-dd1-child");
	}

}
