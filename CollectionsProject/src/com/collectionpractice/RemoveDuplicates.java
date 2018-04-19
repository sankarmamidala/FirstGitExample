package com.collectionpractice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates
{
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(123);
		al.add(12);
		al.add(1);
		al.add(13);
		al.add(123);
		al.add(13);
		al.add(23);
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
		
		
		HashSet set=new HashSet(al);
		
		System.out.println(set);
		
		
		
	}

}
