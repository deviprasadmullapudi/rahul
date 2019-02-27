package com.icici.loans.homeloans;

public interface Rbi


{
	public void withdrawl();
	public void deposit();
	public static void main(String[] args) 
	{
		Rbi i=new Axis();
		i.deposit();
		i.withdrawl();
		Rbi i1=new ChildClass();
		i1.deposit();
		i1.withdrawl();
		
		
	}
	
	
	
	
	
	

}
