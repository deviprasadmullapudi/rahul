package exceptions;

import java.util.Scanner;

public class UserException extends Exception

{

	
	public UserException(String string)
	{
		super(string);
		
	}

	public static void main(String[] args)
	{
		
		
		while (true)
		{  
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the alphanumeric value :");
			String val=sc.nextLine();
			
			
			try 
			{
				if (val.length() != 10)
					try 
				{
						throw new UserException("Value should be 10 digit alphanumeric value");
					} 
				catch (UserException e) 
				{

						e.printStackTrace();
					}
				
				
				
				else 
				{
					System.out.println(val);
					break;
				}
			} 
			catch (Exception e) 
			{
				
				e.printStackTrace();
			} 
			finally 
			
			{
				System.out.println("I am final Block.......");
			}
		}
		
				
		
		
				
		
	}

}
