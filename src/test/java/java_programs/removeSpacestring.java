package java_programs;

public class removeSpacestring
{
    public static void main(String[] args)
    {
		String s="i am a test engineer";
		System.out.println(s.replaceAll(" ", ""));
		
		//without replace function
		String[] s1 = s.split(" ");
		System.out.println(s1[0]+s1[1]+s1[2]+s1[3]+s1[4]);
    	
	}
}
