package java_programs;

public class revsentence 
{

	public static void main(String[] args) 
	{
		//reverse of sentence
		String s="i am test engineer";
		String[] s1=s.split(" ");
		System.out.println(s1[3]+" "+s1[2]+" "+s1[1]+" "+s1[0]);
		
		//reverse of characters
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}
}
