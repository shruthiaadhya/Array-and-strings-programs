package arraysPrograms;

public class inserteleParticularposition 
{
	public static void main(String[] args)
	{
       int[] a= {20,30,40,50,60};
       int[] a1=new int[a.length+1];
       int n=2;
       int x=70;
       
       for(int i=0;i<a.length+1;i++)
       {
    	   if(i<n)
    	   {
    		   a1[i]=a[i];
    	   }
    	   else if(i==n)
    	   {
    		   a1[i]=x;
    	   }
    	   else
    	   {
    		   a1[i]=a[i-1];
    	   }
       }
       
       for(int j=0;j<a1.length;j++)
       {
    	   System.out.print(a1[j]+" ");
       }
	}
}
