package com.info1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharsFromString {
	
	public static void main(String[] args) {
		String word = "sravankumar";
		Map<Character,Integer> map = new HashMap<>();
		char[] charArray = word.toCharArray();
		for (char c : charArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		for (Character character : keys) {
			System.out.println(character+" "+ "is repeated for"+" "+map.get(character)+" "+"times");
		}
		
	}

}
