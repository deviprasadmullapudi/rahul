package com.icici.loans.carloans;

public class FirstClass 
{

		int a=10,b=20, c;
		public void add()
		{
			c=a+b;
			System.out.println("Addition of A & B IS :" + c);
		}
		public void sub()
		{
			c=a-b;
			System.out.println("Substraction of A & B IS :" +c);
		}
		
	public static void main(String[] args) 
	{
		
	
	FirstClass obj = new FirstClass();
	obj.add();
	obj.sub();
	System.out.println("the iast vaiue of c is:" +obj.c);
	


	}

}
