package arraysPrograms;

public class OccuranceOfEle 
{
	public static void main(String[] args) 
	{
      String[] s= {"shru","poo","shru","aadhya","shru"};
      String s1="shru";
      int cnt=0;
      for(int i=0;i<s.length;i++)
      {
    	  if(s[i].equals(s1))
    	  {
    		  cnt++;
    	  }
      }
      System.out.println(s1+" is occured: "+cnt+" times");
	}
}
