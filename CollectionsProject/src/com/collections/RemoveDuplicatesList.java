package com.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesList {

	public static void main(String[] args)
	{
		 ArrayList<String> al = new ArrayList<String>();
		    al.add("Tom");
		    al.add("Jones");
		    al.add("Sam");
		    al.add("Jamie");
		    al.add("Robie");
		    al.add("Helen");
		    al.add("Tom");
		    al.add("Troy");
		    al.add("Mika");
		    al.add("Tom");
		    al.add("Tom");
		    al.add("Tom");
		    al.add("Tom");
		    System.out.println(al);
for(int i=0;i<al.size();i++)
{
	for(int j=i+1;j<al.size();j++)
	{
		if(al.get(i).equals(al.get(j)))
		{
			al.remove(j);
			j--;
		}
	}
}
	System.out.println(al);
	
	}
}