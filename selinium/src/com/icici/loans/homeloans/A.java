package com.icici.loans.homeloans;

 public class A 
{

	int b=10, c=20, d;
	void add()
	{
		d=b+c;
		System.out.println("Addition of b & c:" +d);
	}
	void sub()
	{
		d=c-b;
		System.out.println("substraction of c & b:" +d);
	}
	public static void main(String[] args) 
	{
		A a=new A();
		a.add();
		a.sub();
		

	}

}
