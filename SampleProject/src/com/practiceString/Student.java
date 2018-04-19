package com.practiceString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student  
{	
	public static void main(String[] args) 
	{
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("saa");
		al.add("saa");
		al.add("saa");		
		al.add("saa");
		al.add("saa");
		al.add("saa");
		
		System.out.println(al);
		
		String[] str=new String[al.size()];
		
		al.toArray(str);
		
		for(String tmp:str)
			System.out.println(tmp);
		
		
		
		String[] strr={"java","hcl","sa"};
		
	List<String> list =	Arrays.asList(strr);
		
	System.out.println(list);
		
	}
}