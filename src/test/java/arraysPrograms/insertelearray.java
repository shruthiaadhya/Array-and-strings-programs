package arraysPrograms;

import java.util.Scanner;

public class insertelearray 
{
	public static void main(String[] args) 
	{
		int n=4;
       String s[]=new String[n];
       String ele;
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<n;i++)
       {
    	  System.out.println("Enter "+i+" element");
    	  ele=sc.next();
    	  s[i]=ele;
       }
       for(int j=0;j<s.length;j++)
       {
    	   System.out.print(s[j]+" ");
       }
	}
}
