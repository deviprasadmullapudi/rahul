package com.variables;

public class A 

{
int x=100;
static String cname="vmware";
static A a;


void m1()
{
	int x=200;                      //the value of the local variable x is not used
	a=new A();
	System.out.println("i am m1 in Class A");
	System.out.println(x);
	System.out.println(A.cname);
	
}

static void m2()
{
	 a=new A();
	System.out.println(a.x);

	
	
}


	public static void main(String[] args) 
	{
		a=new A();
	   a.m1();
	   a.m2();
	  
	  
	  
	  
	  
	  

	}

}
