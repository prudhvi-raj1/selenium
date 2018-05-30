package com.gmail.testscript;

class A{  
int data=50;//instance variable  
static int m=100;//static variable  
static int m1=120;
void method(){  
int n=90;//local variable 
System.out.println(n);
int data=100;
System.out.println(data);
m=120;
System.out.println(m);
}  
}//end of class  

public class Variable {

	public static void main(String[] args) {
		
 A a= new A();
 a.method();
	}

}
