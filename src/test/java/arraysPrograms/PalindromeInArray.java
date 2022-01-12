package arraysPrograms;

public class PalindromeInArray 
{
	public static void main(String[] args) 
	{
      int[] s= {12,34,11,53,45,99,33};
      int scopy;
      int temp;
      int rem;
      for(int i=0;i<s.length;i++)
      {
    	  scopy=s[i];
    	  temp=s[i];
    	  int rev=0;
    	  while(temp>0)
    	  {
    		  rem=temp%10;
    		  temp=temp/10;
    		  rev=rev*10+rem;
    	  }
    	  if(rev==scopy)
    	  {
    		  System.out.println(rev+" is a palindrome number");
    	  }
      }
	}
}
