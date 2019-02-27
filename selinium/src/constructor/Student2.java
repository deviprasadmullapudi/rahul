package constructor;

import java.util.Scanner;

public class Student2 
{
	int a, b, c;
	scanner sc=new Scanner();
	public Student2(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public void add()
	{
		c=a+b;
		System.out.println("Add  :" + c);
		
	}
	public void sub()
	{
		c=a-b;
		System.out.println("sub  :"+ c);
	}
	
	public static void main(String[] args)
	{
		Student2 s2=new Student2();
		s2.add();
		s2.sub();

	}

}
