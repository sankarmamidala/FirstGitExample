package com.arry83;

import java.util.Arrays;

public class Sample {

	public static int sumOfNum(int n)
	{
		int sum = n*(n+1)/2;
		return sum;
	}
	public static int sumOfEle(int[] array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			 sum=sum+array[i];
		}
		return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		
	int n=20;
	int[] a={1,2,3,4,5,6,8,9,10,11,12,13,14,15,16,17,18,19,20};
	int sumofNumbers=sumOfNum(n);
	int sumofEle=sumOfEle(a);
	int missingNUm=sumofNumbers-sumofEle;
	System.out.println(missingNUm);
		
		
		
	}
}
		/*int[] i = new int[0];
		 
        System.out.println(i[0]);
	}}*/
		
		/*boolean flag = true;
		if(one.length==two.length)
		{
			for(int i =0;i<one.length;i++)
			{
				if(one[i]!=two[i])
				{
					flag=false;
				}
			}
		}
		else
		{
			flag=false;
		}
		if(flag)
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
}
*/
		
		
