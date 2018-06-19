package com.gmail.testscript;

import org.testng.Reporter;
import org,testing.annotations.Test;

public class TestNGex1 {

	public static void main(String[] args) 
	{
		@Beforeclass
		public void openApp();
		{
			System.out.println("logic for openapp");
			
		}
		@Afterclass
		public void closesApp()
		{
			System.out.println("logic for closeapp");
		}
		Before method
		public void login()
		{
			System.out.println("logic for login");
		}
		After Method
		public void logout()
		{
			System.out.println("logic for logout");
		}
		@Test(priority=2,enabled=false)
		public void WD()
		{
			System.out.println("logic for WD");
			Reporter.log("logic for WD");
		}
		@test(priority=3)
		public void BE()
		{
			System.out.println("logic for BE");
			Reporter.log("logic for BE");
		}
		@test(priority=1)
		public void MT()
		{
			System.out.println("logic for MT");
			Reporter.log("logic for MT");
		}

	}

}
