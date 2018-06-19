package com.gmail.testscript;

class Addition1{
	public Addition1(int a, int b) {
		// TODO Auto-generated constructor stub
		int c=a+b;
		System.out.println(c);
	}

}

public class Constructor {

	public static void main(String[] args) 
	{
Addition1 a=new Addition1(10,20);

Addition1 b=new Addition1(30,40);

Multiplication d=new Multiplication(90,30.8);

manual e=new manual();
automation h=new automation();

	}
 
}
class Multiplication {
	
	public Multiplication(int a,double b){
		double c=a*b;
		System.out.println(c);
	}
}
class manual{
	public manual(){
	System.out.println("stlc");
}
}
class automation{
	public automation(){
		System.out.println("sdlc");
	}
}
