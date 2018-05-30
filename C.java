package com.gmail.testscript;

interface Single_interface2{
	void add();
}

 class Add implements Single_interface2{

	@Override
	public void add() {
		// TODO Auto-generated method stub
	int a=20;
	int b=20;
	int c=a+b;
	System.out.println(c);
		
	}
	
}
 
public class C{
	public static void main(String[] args){
		Add b=new Add();
		b.add();
	}
}
