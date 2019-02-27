package com.icici.loans.homeloans;

public class ChildClass5 extends FirstAbstract
{

	public static void main(String[] args) 
	{
		 ChildClass5 c=new ChildClass5();
		 c.m1();
		 c.m2();

	}

	@Override
	public void m2() 
	{
		System.out.println("i am overriding m2 in ChildClass5");
		
	}

}
