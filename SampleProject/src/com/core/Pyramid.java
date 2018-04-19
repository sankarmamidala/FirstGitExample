package com.core;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args)
	{
		int count=1;
		for(int i=0;i<=6;i++)
	{
		int n=6;
		for(int spc=n-i;spc>0;spc--)
		{
			System.out.print(" ");
		}
		for(int j=0;j<count;j++)
		{
			System.out.print(j+1+"");
		}
		count=count+2;
		System.out.println();
		
	}
		
		
}
}