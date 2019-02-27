package Strings;

public class StringClass 
{

	public static void main(String[] args)
	{
		String s1="Deviprasad";
			
	    System.out.println(s1);
	    System.out.println(s1.hashCode());
	    String s2=new String("Mullapudi");
	    System.out.println(s2);
	    System.out.println(s2.hashCode());
	    
	
	    s1=s1.concat(s2);
	    System.out.println(s1);
	    System.out.println(s1.endsWith("DeviprasadMullapudi"));
	    
	}

	
}
