package arraysPrograms;

import java.util.Arrays;

public class binarysearch {

	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50,90};
		Arrays.sort(a);
		int n=30;
		int first=0,last=a.length-1;
		int mid=(first+last)/2;


		while( first <= last )
		{  
			if ( a[mid] < n )
			{  
				first = mid + 1;     
			}
			else if ( a[mid] == n )
			{  
				System.out.println("Element is found at index: " + mid);  
				break;  
			}
			else
			{  
				last = mid - 1;  
			}  
			mid = (first + last)/2;  
		}  
		if ( first > last )
		{  
			System.out.println("Element is not found!");  
		}  

	}

}
