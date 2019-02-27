package overloading;

public class OverLoading
{
	/*public void m1(int i)
	{
		System.out.println("Integer Method");
	}*/
	public void m1(float f)
	{
		System.out.println("Floating Method");
	}
	public void m1(String s)
	{
		System.out.println("String Method");
	}

	
	
	public static void main(String[] args)
	{
		OverLoading ol=new OverLoading();
		ol.m1(100);
		ol.m1(100.2f);
		ol.m1(null);

	}

}
