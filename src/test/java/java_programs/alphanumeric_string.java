package java_programs;

public class alphanumeric_string 
{
 public static void main(String[] args) 
 {
	
	//using regular expression
	String s="shruh##2ti12345";
//	if(s.matches("[a-zA-Z0-9]+"))
//	{
//		System.out.println(s+" is a alphanumeric");
//	}
//	else
//	{
//		System.out.println(s+" not a alphanumeric");
//	}
	
	//without builtin
	boolean result=true;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(!(ch>='a'&& ch<='z')&&(ch>='A'&& ch<='Z')&&(ch>='0' && ch<='9'))
		{
			result=false;
		}
		result=true;
	}
	 if(result==true)
	 {
		 System.out.println("alphanumeric");
	 }
	 else
	 {
		 System.out.println("not alphanumeric");
	 }
	
  }
}
