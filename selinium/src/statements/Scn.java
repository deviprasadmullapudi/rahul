package statements;

import java.util.Scanner;

public class Scn 
{

	public static void main(String[] args)
	{
      Scanner s=new Scanner(System.in);
      int a=0, b=0;
      System.out.print("Enter the value of a :");
      a=s.nextInt();
      System.out.print("Enter the value of b :");
      b=s.nextInt();
      System.out.println("The value of a is :" + a);
      System.out.println("The value of b is :" + b);
      System.out.println("The value of addition is :" + (a+b) );
      

	}

}
