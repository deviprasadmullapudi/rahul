package com.icici.loans.homeloans;

public abstract class FirstAbstract 
{
   public void m1()    //concrete method
   {
	   System.out.println("i am concrete m1 from FirstAbstract");
   }
   public abstract void m2();    //abstract method
   
   
	public static void main(String[] args) 
	{
		//FirstAbstract f=new FirstAbstract();  //error
		
	}

}
