package com.icici.loans.homeloans;

public class ChildClass implements Rbi
{

	public static void main(String[] args)
	{
		ChildClass c1=new ChildClass();
		c1.deposit();
		

	}

	@Override
	public void withdrawl() 
	{
		System.out.println("I am overriding withdrawl in childclass");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("i am overriding deposite in childclass");
		
	}

}
