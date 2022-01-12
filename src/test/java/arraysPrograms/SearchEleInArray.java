package arraysPrograms;

public class SearchEleInArray 
{
	public static void main(String[] args) 
	{
       String[] s= {"apple","mango","chiku","grapes"};
       String s1="mango";
       for(int i=0;i<s.length;i++)
       {
    	   if(s[i].equals(s1))
    	   {
    		   System.out.println(s1+" found at "+i+" position");
    	   }
       }
       
       
	}
}
