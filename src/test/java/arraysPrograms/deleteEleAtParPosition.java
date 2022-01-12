package arraysPrograms;

public class deleteEleAtParPosition
{
	public static void main(String[] args) 
	{
      String[] s= {"apple","mango","banana","chiku","grapes"};
      String[] s1=new String[s.length-1];
      int n=2;
      for(int i=0;i<n;i++)
      {
    		  s1[i]=s[i];
    	  
      }
      for(int j=n;j<s.length-1;j++)
      {
    	  s1[j]=s[j+1];
      }
      for(int k=0;k<s1.length;k++)
      {
    	  System.out.print(s1[k]+" ");
      }
      
	}
}
