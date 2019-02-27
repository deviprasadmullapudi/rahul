package exceptions;

import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		int nr, dr, result;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter numarator value :");
			nr=sc.nextInt();
			System.out.print("Enter Denominator value:");
			dr=sc.nextInt();	
		try 
		{
			result=nr/dr;
			System.out.println(result);
			break;
	
		} 
		catch (Exception e)
		{
	
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println("The Denominator value must be greater than zero.............");
		}

	}

}
}

