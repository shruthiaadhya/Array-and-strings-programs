package arraysPrograms;

public class Merge2Array 
{
	public static void main(String[] args) 
	{
      int[] a= {1,2,3,4};
      int[] b= {5,6,7};
      int[] c=new int[a.length+b.length];
      
      for(int i=0;i<a.length+b.length;i++)
      {
    	  if(i<4)
    	  {
    		  c[i]=a[i];
    	  }
    	  else
    	  {
    		  c[i]=b[i-a.length];
    	  }
      }
      
      for(int j=0;j<c.length;j++)
      {
    	  System.out.print(c[j]+" ");
      }
	}
}
