package com.Arrays;

import java.util.ArrayList;

public class StringEx {

	public static void main(String[] args) {

		Integer[] arra1={1,2,3,4,5,6,8,9,10,11,12,1,2,3};
		
		for(int i=0;i<arra1.length;i++)
		{
			for(int j=i+1;j<arra1.length;j++)
			{
				if(arra1[i].equals(arra1[j]))
				{
				System.out.println(arra1[i]);	
				}
			}
		}
	}
}