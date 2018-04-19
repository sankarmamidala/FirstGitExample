package com.Arrays;

import java.util.Arrays;

public class ArraysEqualExa {

	public static void main(String[] args) 
	{
		int[] arrayOne={1,2,3,4,5};
		int[] arrayTwo={1,2,3,4,5};
		System.out.println(Arrays.equals(arrayOne, arrayTwo));
		boolean equal=false;
		if(arrayOne.length==arrayTwo.length)
	{
			for(int i=0;i<arrayOne.length;i++)
			{
			if(arrayOne[i]!=arrayTwo[i])
				{
					equal=false;
				}
			}
		}
		if(equal)
			System.out.println("two arrays are equal");
		else
		System.out.println("two arrays are not equal");
	}
}