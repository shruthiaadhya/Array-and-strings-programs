package java_programs;

public class String_reverse 
{
   public static void main(String[] args)
   {
	//1 way Reverse of string 
	   String s="shruthi";
	   for(int i=s.length()-1;i>=0;i--)
	   {
		   System.out.print(s.charAt(i));
	   }
	
	//2 way Reverse of a string
	   String s1="aadhya";
	   String s2="";
	   char ch;
	   System.out.println();
	   for(int i=0;i<s1.length();i++)
	   {
		   ch=s1.charAt(i);
		   s2=ch+s2;
	   }
	   System.out.println(s2);
	   
	 //3 using string buffer reverse of string
	   String s3="pravallika";
	   StringBuffer sb=new StringBuffer(s3);
	   System.out.println(sb.reverse());
	   
	 //4 using string builder reverse of string
	   String s4="deepthi";
	   StringBuilder sbl=new StringBuilder(s4);
	   System.out.println(sbl.reverse());
	   
   }
}
