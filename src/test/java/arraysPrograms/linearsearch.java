package arraysPrograms;

public class linearsearch
{
	public static void main(String[] args) 
	{
        int[] a= {10,40,50,60,20,30};
        int n=20;
        
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]==n)
        	{
        		System.out.println(n+" is found in array at "+i+" position");
        		break;
        	}
        	
        }
       
	}
}
