package com.gmail.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinkTesting {

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqaclasses");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ICICIBank.com");
		List<WebElement>Links=driver.findElementsByTagName("a");
		for(int i=0;i<Links.size();i++){
			if(Links.get(i).isDisplayed()){
				System.out.println(Links.get(i).getText());
				Links.get(i).click();
				System.out.println(driver.getCurrentUrl());
				driver.navigate().back();
				Links=driver.findElementsByTagName("a");
			}
		}
		

	}

}
