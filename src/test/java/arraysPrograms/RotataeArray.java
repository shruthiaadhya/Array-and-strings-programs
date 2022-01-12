package arraysPrograms;

public class RotataeArray
{
	public static void main(String[] args)
	{
      int[] a= {1,2,3,4,5,6,7};
      int temp;
      int n=3;
      
      for(int i=0;i<n;i++)
      {
    	  temp=a[0];
    	  for(int j=0;j<a.length-1;j++)
    	  {
    		  a[j]=a[j+1];
    	  }
    	  a[a.length-1]=temp;
      }
      
      for(int k=0;k<a.length;k++)
      {
    	  System.out.print(a[k]+" ");
      }
	}
}
