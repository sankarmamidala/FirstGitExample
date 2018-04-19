package com.practiceString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class Sample 
{
	public static void main(String[] args) {
		
	
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("sa");
		al.add("ss");
		al.add("ss");
		al.add("ss");
		al.add("ss");
		al.add("ss");
		
		System.out.println(al);
		
		String[] s1=new String[al.size()];
		
		al.toArray(s1);
		
		for(String tmp:s1)
		{
			System.out.println(tmp);
		}
		
		
	}
	
	
	
}
