package com.Arrays;

import java.util.ArrayList;

public class ArrayExample
{
	public static void main(String[] args)
	{
		String[] a={"1","2","3","4","5","3","2"};
		String[] b={"1","2","3","4"};
		ArrayList<String> hs=new ArrayList<String>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i].equals(b[j]))
				{
					hs.add(a[i]);
				}
				
			}
		}
	System.out.println(hs);	
	}

	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
