package com.Arrays;

import java.util.Scanner;

public class OneDi {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("How many subjects:");
		int n=(sc.nextInt());
		int[] marks=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Marks:");
			marks[i]=sc.nextInt();
		}
		int tot=0;
		for(int i=0;i<n;i++)
		tot+=marks[i];
		System.out.println("Total Marks:"+tot);
		float percentage=(float)tot/n;
		System.out.println("percentage:"+percentage);
	}

}
