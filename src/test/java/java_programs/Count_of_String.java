package java_programs;

public class Count_of_String 
{
  public static void main(String[] args)
  {
	String s="ranaprathap@@##1233";
	//System.out.println(s.length());
	int cnt=0;
//	for(int i=0;i<s.length();i++)
//	{
//		if(s.charAt(i)!=' ')	
//		{
//		 cnt++;	
//		}
//	}
//	System.out.println(s+" as "+cnt+" no of characters");	
	
	//Without builtin function
	
	char[] ch=s.toCharArray();
	for(int j=0;j<ch.length;j++)
	{
		cnt++;
	}
	System.out.println("No of characters in a string=  "+cnt);
  }
}
