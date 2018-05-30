package com.gmail.testscript;

public class Overloading 
{
	public int Add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int Add(int a,int b,int c)
	{
		int d=a+b+c;
		return d;
	}

	public static void main(String[] args) 
	{
		Overloading ov=new Overloading();
		int res=ov.Add(10,20);
		System.out.println("result is: "+res);
		res=ov.Add(10, 20, 40);
		System.out.println("result is:"+res);

	}

}
