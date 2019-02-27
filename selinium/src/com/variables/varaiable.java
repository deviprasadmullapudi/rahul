package com.variables;

public class varaiable 
{

	int x=100; //instance or non static or global variables        //object to object
	static String cname="vmware"; //static                        //common names
	
	void m1()
	{
int x=200;
	System.out.println("i am m1 in varaiable");                 //this.x, this is the keyword
	System.out.println(x);
	System.out.println(varaiable.cname);
	}
	
	
	
	public static void main(String[] args)
	{
varaiable a=new varaiable();
a.m1();
System.out.println(a.x);
System.out.println(varaiable.cname);

	}

}
