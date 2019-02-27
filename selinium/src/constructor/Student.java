package constructor;

public class Student 
{
	int stuno;
	String stuname;
	
	public Student()
	{
		System.out.println("It is a default Constructor.......");
	}

	public Student(int i, String string) 
	{
		stuno=i;
		stuname=string;
		
	}

	public static void main(String[] args) 
	{
		Student s1=new Student(100,"Rahul");
		System.out.println(s1.stuno);
		System.out.println(s1.stuname);
		
		Student s2	=new Student(200,"Devi");
		System.out.println(s2.stuno);
		System.out.println(s2.stuname);
		
		Student s3=new Student(300,"Devi");
		System.out.println(s3.stuno);
		System.out.println(s3.stuname);

	}

}
