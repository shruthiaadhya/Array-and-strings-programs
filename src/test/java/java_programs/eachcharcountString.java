package java_programs;

public class eachcharcountString 
{
  public static void main(String[] args)
  {
	String s="shruthi";
	
	for(char ch1='a';ch1<='z';ch1++)
	{
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch1==s.charAt(i))
			{
				cnt++;
			}
		}
		if(cnt>0)
		{
			System.out.println(ch1+":"+cnt);
		}
	}
  }
}
