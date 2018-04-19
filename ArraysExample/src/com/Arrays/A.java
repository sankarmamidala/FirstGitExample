package com.Arrays;

class A
{
	public static void main(String[] args) {
//		String name="madama";
//		String rev="";
//		int i=name.length();
//		for(int j=i-1;j>=0;j--)
//		{
//			rev=rev+name.charAt(j);
//		}
//		if(name.equals(rev))
//		{
//			System.out.println("palindrome");
//		}
//		else
//			System.out.println("not palindrome");
		int count=0;
		System.out.println(args[0]+args[1]);
		for(int i=0;i<20;i++)
		{
			if(i%2==0)
			{
				System.out.println("evenumbers"+i);
				count++;
			}
			
		}
		System.out.println("evennumbers1to20:"+count);
	}
    
       
        
        
 }