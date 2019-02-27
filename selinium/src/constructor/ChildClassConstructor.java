package constructor;

public class ChildClassConstructor extends Employee
{
	int x;
	
	public ChildClassConstructor(int x)
	{
		super(20,"abc",20.00f);
		
		this.x=x;
		System.out.println(this.x);
	}

	public static void main(String[] args) 
	{
		ChildClassConstructor obj=new ChildClassConstructor(10);
		System.out.println(obj.x);

	}

}
