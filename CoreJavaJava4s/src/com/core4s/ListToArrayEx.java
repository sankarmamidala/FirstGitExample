package com.core4s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ListToArrayEx 
{
	public static void main(String[] args) {
             
		/*ArrayList<String> list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("six");
		list.add("Seven");
		
		for(String tmp1:list)
		
		System.out.println("List of elements:"+tmp1);
		System.out.println("List of size:"+list.size());
		
		String[] arr=new String[list.size()];
		list.toArray(arr);
		for(String tmp:arr)
		System.out.println("List of elements:"+tmp);
		System.out.println("List of size:"+list.size());
		
		*/
		
		/*String s="(123)-45678@@!!!!$%&(*9-4789";
		s=s.replaceAll("[^a-zA-Z8-9]", "");
		System.out.println(s);*/
		
		ArrayList li=new ArrayList();
		li.add("One");
		li.add("One");
		li.add("e");
		li.add("ne");
		li.add("On");li.add("One");
		li.add("1235");
		li.add("One");
		System.out.println("Before remove element:"+li);
		for( int i=0;i<li.size();i++)
		{
			for(int j=i+1;j<li.size();j++)
			{
				if(li.get(i).equals(li.get(j)))
				{
					li.remove(j);
					j--;
				}
			}
		}
		System.out.println("after remove the elememt:"+li);
	}

}
