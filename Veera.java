package com.gmail.testscript;

import org.omg.Messaging.SyncScopeHelper;

class Veera1{
	void m1(){
		System.out.println("Hai");
	}
	void m2(){
		System.out.println("Hello");
	}
	void m3(){
		System.out.println("prudhvi");
	}
}
class Addition
{
int add(){
int a=10;
int b=20;
int c= a+b;
//System.out.println(c);
System.out.println(c);
return c;
}
}


public class Veera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veera1 obj = new Veera1();
		obj.m1();
		obj.m2();
		obj.m3();
		
		Addition a = new Addition();
		a.add();
		
//		Addition a = new Addition(10,20)
		
	}


}
