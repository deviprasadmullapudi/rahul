package exceptions;

import java.util.Scanner;

public class ExceptionDemoclass 
{

	public static void main(String[] args) 
	{
		int nr=100, dr=0, result;
		Scanner sc=new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("Enter numarator value :");
			nr=sc.nextInt();
			System.out.println("Enter denominator value :");
			dr=sc.nextInt();
					
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			catch (Exception e) 
			{
             
			 e.printStackTrace();
			 System.out.println(e);
             System.out.println("Denominator value should greater than zero");
			
			
			} 
		}

	}

}
