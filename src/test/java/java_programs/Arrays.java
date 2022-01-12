package java_programs;

public class Arrays 
{
   public static void main(String[] args) 
   {
//	 int[] a= {11,33,44,22,98,07};
//	 int temp;
//	 
//	 for(int i=0;i<a.length;i++)
//	 {
//		 for(int j=0;j<a.length-1;j++)
//		 {
//			 
//			 if(a[j]>a[j+1])
//			 {
//				 temp=a[j];
//				 a[j]=a[j+1];
//				 a[j+1]=temp;
//			 }
//		 }
//	 }
//	 
//	 for(int k=0;k<a.length;k++)
//	 {
//		 System.out.println(a[k]);
//	 }
	  
//	  //Prime number program
//	  int num=22;
//	  int cnt=0;
//	  for(int i=1;i<=num;i++)
//	  {
//		  if(num%i==0)
//		  {
//			  cnt++;
//		  }
//	  }
//	  if(cnt==2)
//	  {
//		  System.out.println(num+" is prime number");
//	  }
//	  else
//	  {
//		  System.out.println(num+" is not a prime number");
//	  }
	  
	  
	  //Prime numbers from 1 to n numbers
//	  int n=100;
//	  for(int i=1;i<=n;i++)
//	  {
//		  int num1=i;
//		  int cnt1=0;
//		  for(int j=1;j<=i;j++)
//		  {
//			  if(num1%j==0)
//			  {
//				  cnt1++;
//			  }
//		  }
//		  
//		  if(cnt1==2)
//		  {
//			  System.out.println(num1+" is a prime number");
//		  }
//	  }
	  
	  //perfect number program
	   
//	   int num=10,i,sum=0,numc=num;
//	   for(i=1;i<=num/2;i++)
//	   {
//		   if(num%i==0)
//		   {
//			   sum=sum+i;
//		   }
//	   }
//	   
//	   if(sum==numc)
//	   {
//		   System.out.println(numc+" is a perfect number");
//	   }
//	   else
//	   {
//		   System.out.println(numc+" is not a perfect number");
//	   }
	   
	   //perfect numbers from 1 to n
	   
//	  int n=50,n1,n1c;
//	  for(int i=1;i<=n;i++)
//	  {
//		  n1=i;
//		  n1c=i;
//		  int sum=0;
//		  for(int j=1;j<=i/2;j++)
//		  {
//			  if(n1%j==0)
//			  {
//				  sum=sum+j;
//			  }
//		  }
//		  
//		  if(sum==n1c)
//		  {
//			  System.out.println(n1c+" is a perfect number");
//		  }
//	  }
	  
	   //palindrome number
	   
//	   int num=545,rev=0,rem,numc=num;
//	   while(num>0)
//	   {
//		   rem=num%10;
//		   num=num/10;
//		   rev=rev*10+rem;
//	   }
//	   if(rev==numc)
//	   {
//		   System.out.println(rev+" is a palindrome number");
//	   }
//	   else
//	   {
//		   System.out.println(rev+" is not a palindrome number");
//	   }
	   
	   //Strong number program
//	   int num=145,ln,sum=0,numc=num;
//	   while(num>0)
//	   {
//		   int fact=1;
//		   ln=num%10;
//		   num=num/10;
//		   for(int i=ln;i>0;i--)
//		   {
//			   fact=fact*i;
//		   }
//		   sum=sum+fact;
//	   }
//	   if(sum==numc)
//	   {
//		   System.out.println(sum+" is a strong number");
//	   }
//	   else
//	   {
//		   System.out.println(sum+" is not a strong number");
//	   }
	   
	   //swapping without variable 
	   
//	   int num1=24,num2=48;
//	   
//	   num1=num1+num2;
//	   num2=num1-num2;
//	   num1=num1-num2;
//	   
//	   System.out.println("num1="+num1+"  num2="+num2);
	   
	   //fibonacci numbers
	   
//	   int n=7,n1=0,n2=1,n3;
//	   System.out.println(n1);
//	   System.out.println(n2);
//	   for(int i=0;i<=n;i++)
//	   {
//		   n3=n1+n2;
//		   n1=n2;
//		   n2=n3;
//		   System.out.println(n3);
//	   }
	   
	   //Amstrong number or not
	   
//	   int num=153,rem,ams=0,numc=num;
//	   while(num>0)
//	   {
//		   rem=num%10;
//		   num=num/10;
//		   ams=ams+rem*rem*rem;
//	   }
//	   
//	   if(ams==numc)
//	   {
//		   System.out.println(ams+" is a amstrong number");
//	   }
//	   else
//	   {
//		   System.out.println(ams+" is not a amstrong number");
//	   }
	   
	   //number is happy or not
	   
	   int num=23,ln,sum=0;
	   int temp=num;
	   while(num>9)
	   {
	      while(num>0)
	     {
		   ln=num%10;
		   num=num/10;
		   sum=sum+(ln*ln);
	      }
	      num=sum;
	      sum=0;
	   }
	   
	   if(num==1)
	   {
		   System.out.println(temp+"  is happy number");
	   }
	   else
	   {
		   System.out.println(temp+" is not a happy number");
	   }
   }
}
