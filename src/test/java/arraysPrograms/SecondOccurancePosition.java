package arraysPrograms;

public class SecondOccurancePosition 
{
	public static void main(String[] args) 
	{
      int[] a= {10,20,30,20,40,50};
      int n=20;
      int cnt=0;
      int pos=-1;
      for(int i=0;i<a.length;i++)
      {
    	  if(a[i]==n)
    	  {
    		  cnt++;
    	  }
    	  if(cnt==2)
    	  {
    		  pos=i;
    		  break;
    	  }
      }
      System.out.println(n+" second occurance position: "+pos);
	}
}
