package com.gmail.testscript;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettextMethod {

	private static Object s;

	public static <webelement> void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver ();
		driver.get("https://www.msn.com");
		List<webelement>llist=driver.findElement(Bytagname("a"));
		System.out.println(llist.size());
		String text=llist.get((int) s).gettext();
		System.out.println(text);
		
		
		

	}

}
