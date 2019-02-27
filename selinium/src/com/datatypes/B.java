package com.datatypes;

public class B 
{
	
 byte b=10;   // 1 byte
 short s=20;   // 2 bytes
 int i=30;     // 4 bytes
 long l=40;    // 8 bytes
 
 float f=50.00f;  //4 bytes
 double d=60.00;  //8 bytes
 
 boolean bb=true; //true or false
 char ch='a';
 
  String str="Devi Prasad";
 
	public static void main(String[] args) 
	{
		
	 B ob=new B();
	 
		System.out.println("The value of byte:"+ob.b);
		System.out.println("The value of short:"+ob.s);
		System.out.println("The value of int:"+ob.i);
		System.out.println("The value of long:"+ob.l);
		System.out.println("The value of float:"+ob.f);
		System.out.println("The value of double:"+ob.d);
		System.out.println("The value of boolean:"+ob.bb);
		System.out.println("The value of char:"+ob.ch);
		System.out.println("The value of string:"+ob.str);
	}

}
