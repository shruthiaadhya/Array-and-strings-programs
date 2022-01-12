package arraysPrograms;

public class reverseaarray 
{
	public static void main(String[] args) 
	{
       int a[]= {1,3,4,5,2};
//       for(int i=a.length-1;i>=0;i--)
//       {
//    	   System.out.print(a[i]+" ");
//       }
       
       //using swapping approach
       int b[]=new int[a.length];
       int n=a.length;
       for(int i=0;i<a.length;i++)
       {
    	   b[n-1]=a[i];
    	   n=n-1;
       }
       for(int k=0;k<b.length;k++)
       {
    	   System.out.print(b[k]+" ");
       }
       
	}
}
