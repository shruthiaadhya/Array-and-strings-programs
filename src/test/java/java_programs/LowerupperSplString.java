package java_programs;

public class LowerupperSplString 
{
	 public static void main(String[] args) 
	 {
		String s="SHRUTHIaadhya!@#$%$";
		int cntl=0,cntu=0,cntspl=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
			{
				cntu++;
			}
			else if(s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				cntl++;
			}
			else
			{
				cntspl++;
			}
		}
		
		System.out.println("no of Upper case letters :"+cntu);
		System.out.println("no of lower case letters :"+cntl);
		System.out.println("no of spl characters :"+cntspl);
	 }

}
