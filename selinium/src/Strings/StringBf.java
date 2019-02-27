package Strings;

public class StringBf 
{

	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("Deviprasad");
		
	    System.out.println(s1);
	    System.out.println(s1.hashCode());
	    StringBuffer s2=new StringBuffer("Mullapudi");
	    System.out.println(s2);
	    System.out.println(s2.hashCode());
	    
	
	    s1=s1.append(s2);
	    System.out.println(s1);
	    System.out.println(s1.hashCode());
	    
	    System.out.println(s1.capacity());
	}

}
