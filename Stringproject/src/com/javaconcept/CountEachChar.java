package com.javaconcept;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Set;

public class CountEachChar 
{
	 static void CountEachCharacter(String input)
	{
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		char[] ca=input.toCharArray();
		
		for(char c:ca)
		{
			if(hm.containsKey(c))
				
				hm.put(c, hm.get(c)+1);
			else
			{
				hm.put(c, 1);
			}
		}
//System.out.println(hm);		

Set<Character> set = hm.keySet();
for(char c:set)
{
	if(hm.get(c)==2)
	{
		System.out.println(c+"------>"+hm.get(c));
	}
}
	}
	 
	 
	 public static void main(String[] args) {
		
		 CountEachCharacter("rajuaau");
		 
	}

}
