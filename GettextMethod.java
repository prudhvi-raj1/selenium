package com.gmail.testscript;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettextMethod {

	private static Object s;

	public static <webelement> void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver ();
		driver.get("https://www.msn.com");
		List<webelement>Llist=driver.findElement(ByTagName("a"));
		System.out.println(Llist.size());
		String text=Llist.get((int) s).gettext();
		System.out.println(text);
		
		
		

	}

}
