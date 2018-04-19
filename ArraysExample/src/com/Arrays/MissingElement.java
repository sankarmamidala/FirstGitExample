package com.Arrays;

public class MissingElement
{
	public static int sumOfNumber(int n)
	{
		int sum=(n*(n+1)/2);
		return sum;
	}
	public static int sumOfElements(int[] array)
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
		int sumOfNumber=sumOfNumber(n);
		int sumOfElements=sumOfElements(a);
		int MissingNumber=sumOfNumber-sumOfElements;
		System.out.println(MissingNumber);
				
	}

}
