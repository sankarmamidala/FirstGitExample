package com.core;

public class PalindromeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=121;
		int num=number;
		int temp=0;
		int rev=0;
		while(num>0)
		{
			temp=num%10;
			num=num/10;
			rev=rev*10+temp;
			
		}
		if(number==rev)
			System.out.println("p");
		else
			System.out.println("n");
	}
	}


