package constructor;

public class Employee2
{
	int eno;
	String ename;
	float sal;
	
	
	public Employee2()
	{
		System.out.println("It is a default constructor........");
	}
	public Employee2(int eno, String ename)
	{
		this(30);
		this.eno=eno;
		this.ename=ename;
		System.out.println("Constructor 2 Emp Number :"+eno);
		System.out.println("Constructor 2 Emp Name :"+ename);
	
		
	}
	public Employee2(int eno, String ename, float sal) 
	{
		this(20,"Dp");
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		System.out.println("Constructor 1 Emp Number :"+eno);
		System.out.println("Constructor 1 Emp Name :"+ename);
		System.out.println("Constructor 1 Emp Salary:"+sal);
		
		
	}
	public Employee2(int eno) 
	{
		this();
		this.eno=eno;
		System.out.println("Constructor 3 Emp Number :"+eno);
		
		
	}
	public static void main(String[] args) 
	{
		Employee2 e1=new Employee2(10,"DSP",2000.00f);
		
		

	}

}
