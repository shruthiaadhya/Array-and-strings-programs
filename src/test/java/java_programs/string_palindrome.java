package java_programs;

public class string_palindrome 
{
	public static void main(String[] args)
	{
		String s="madam";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s1.equalsIgnoreCase(s))
		{
			System.out.println(s1+" is a palindrome");
		}
		else
		{
			System.out.println(s1+" is not a palindrome");
		}
	}

}
