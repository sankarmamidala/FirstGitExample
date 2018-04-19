package com.info1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateCharsInString {

	public static void main(String[] args) {
		String word ="sravankumar";
		String word1 = "";
		char[] ch = word.toCharArray();
		List<Character> list = new ArrayList<>();
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < ch.length; i++) {
			list.add((Character)ch[i]);
		}
		Object[] array = list.toArray();
		for (Object object : array) {
			
			if(list.indexOf(object) != list.lastIndexOf(object)) {
				list.remove(list.lastIndexOf((Character)object));
				set.add((Character) object);
			}
		}

		for (Character c: list) {
			word1 = word1+c;
		}
		System.out.println("Original String ::"+word);
		System.out.println("After removing Duplicate::"+word1);
		
	}
}
