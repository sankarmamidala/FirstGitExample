package com.core;

import java.util.Scanner;

public class Sample1
{
	public static void main(String args[])
//	   {
//	        int num,f,f1=0,f2=1;
//	   
//	   System.out.println("enter the number");
//	    
//	    Scanner sc=new Scanner(System.in);
//	    
//	    num=sc.nextInt();
//	       
//	 for(int i=0;i<=num;i++)
//    {
//	   f=f1;  
//	   f1=f2;  
//	   f2=f+f1;
//	     
//	   System.out.print(f2);
//   }        
//	 }
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		long f1=0,f2=1;
		long f=f1+f2;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f);
		int n=sc.nextInt();
		int count=3;
		while(count<n)
		{
			f1=f2;
			f2=f;
			f=f1+f2;
			System.out.println(f);
			count++;
		}
	
	
	}
	}
