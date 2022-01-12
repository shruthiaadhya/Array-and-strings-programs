package arraysPrograms;

public class FirstAndSecBiggestNo 
{
	public static void main(String[] args) 
	{
       int[] a= {120,40,50,20,59,60,90};
       int max=0;
       int secmax=0;
       
       for(int i=0;i<a.length;i++)
       {
    	   if(a[i]>max)
    	   {
    		   secmax=max;
    		   max=a[i];
    	   }
    	   else if(a[i]>secmax && a[i]!=max)
    	   {
    		   secmax=a[i];
    	   }
       }
       System.out.println("First bigger number: "+max);
       System.out.println("second bigger number: "+secmax);
	}
}
