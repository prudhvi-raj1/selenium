package com.gmail.testscript;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.internal.*;
import org.openqa.selenium.By;
import java.util.List;

public class Images {

	public static void main(String[] args) 
	{
		//open with mercury travels
		ProfilesIni Ini pr=new ProfilesIni();
		FirefoxProfile fp=Pr.getprofile("onine requirement");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http//:mercurytravles.com");
		driver.manage().window().maximize();
		//count no of images
		list<webelement>Images=driver.findElementByTagName("Img");
		System.out.println("Images size()");
		

	}

}
