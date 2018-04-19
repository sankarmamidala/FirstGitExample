package com.core;

public class ArmstrongNUmber 
{
	public static void main(String[] args)
	{
//		sum of the qubes number is total that number is armstrong
		int num=153;
		int arm=num;
		int rev=0,temp;
		while(arm>0)
		{
			temp=arm%10;
			rev=rev+temp*temp*temp;
			arm=arm/10;
			
		}
		System.out.println(rev);
		if(rev==num)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
	}

}
