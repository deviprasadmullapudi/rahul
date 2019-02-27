package com.icici.loans.homeloans;

public class Axis implements Rbi

{

	public static void main(String[] args)
	{
		Axis a1=new Axis();
		a1.deposit();
		a1.withdrawl();
		
		
		

	}

	@Override
	public void withdrawl() 
	{
		System.out.println("I am overriding withdrawl in Axis");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("I am overriding deposite in Axis");
		
	}

}
