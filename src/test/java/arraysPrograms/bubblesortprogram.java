package arraysPrograms;

public class bubblesortprogram
{
	public static void main(String[] args) 
	{
       int[] a= {33,55,66,77,22,11};
       int temp=0;
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=0;j<a.length-1;j++)
    	   {
    		   if(a[j]>a[j+1])
    		   {
    			   temp=a[j];
    			   a[j]=a[j+1];
    			   a[j+1]=temp;
    		   }
    	   }
       }
       
       for(int k=0;k<a.length;k++)
       {
    	   System.out.println(a[k]);
       }
	}
}
