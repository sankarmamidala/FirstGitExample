package com.practiceString;

import java.util.HashMap;
import java.util.Set;

public class StringEx
{
	static void inputString(String str)
	{
		HashMap<Character,Integer> count =new HashMap<Character,Integer>();
		
		char[] charArray = str.toCharArray();
		
		for(Character c:charArray)
		{
			
			if(count.containsKey(c))
			{
				count.put(c, count.get(c)+1);
			}
			else
			{
				count.put(c, 1);
			}
			
		}
		System.out.println(count);
			
		Set<Character> keySet = count.keySet();	
		System.out.println("inpunt String:"+str);
		
		for( Character ch:keySet)
		{
			if(count.get(ch)>1)
			{
				System.out.println(ch+":"+count.get(ch));
			}
		}

		
		
	}
	
	
	public static void main(String[] args)
	{
		
		inputString("sankar");
		
	}
}
