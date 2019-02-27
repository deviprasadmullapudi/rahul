package com.icici.loans.carloans;

public class SecondClass 
{
	int a=10, b=20, c;
	public void mul() 
	{
		c=a*b;
		System.out.println("Multiplication of a & b:"+ c);
	}
	public void div()
	{
		c=b/a;
		System.out.println("Division of a & b:"+ c);
		
	}
	
	
	

	public static void main(String[] args)
	{
		SecondClass Var=new SecondClass();
		Var.mul();
		Var.div();
		System.out.println(Var.c);

	
		
	}

}
