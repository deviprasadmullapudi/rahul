package constructor;

public class Employee
{

	int eno;
	String ename;
	float sal;
	
	
	public Employee()
	{
		System.out.println("It is a default constructor........");
	}
	public Employee(int eno, String ename)
	{
		this.eno=eno;
		this.ename=ename;
		
	}
	public Employee(int eno, String ename, float sal) 
	{
		
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		
		
	}
	public Employee(int eno) 
	{
		this.eno=eno;
		
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee(10,"DSP",2000.00f);
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		System.out.println(e1.sal);
		
		Employee e2=new Employee(20,"DP");
		System.out.println(e2.eno);
		System.out.println(e2.ename);
		System.out.println(e2.sal);
		
		Employee e3=new Employee(30);
		System.out.println(e3.eno);
		System.out.println(e3.ename);
		System.out.println(e3.sal);
		
		Employee e4=new Employee();
		System.out.println(e4.eno);
		System.out.println(e4.ename);
		System.out.println(e4.sal);

	}

}
