package arraysPrograms;

public class BigAndSmallNoInArray
{
	public static void main(String[] args) 
	{
        int[] a= {40,50,60,100,120,4};
        int max=a[0];
        int min=a[0];
        
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]>max)
        	{
        		max=a[i];
        	}
        	else if(a[i]<min)
        	{
        		min=a[i];
        	}
        }
        
        System.out.println("Biggest number in array :"+max);
        System.out.println("smallest number in array: "+min);
	}
}
