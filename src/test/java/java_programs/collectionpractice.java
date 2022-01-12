package java_programs;

import java.util.ArrayList;

public class collectionpractice 
{
    public static void main(String[] args) 
    {
		ArrayList a= new ArrayList();
		a.add(11);
		a.add("shru");
		a.add(true);
		a.add(null);
		a.add(0.09f);
		System.out.println(a);
		
		a.add(1, "aadhya");
		System.out.println(a);
		
		Object a1 = a.clone();
		System.out.println(a1);
		
	System.out.println(a.contains("aadhya"));	
	

		
		
	}
}
