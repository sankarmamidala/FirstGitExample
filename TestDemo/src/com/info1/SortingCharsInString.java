package com.info1;

import java.util.Arrays;

public class SortingCharsInString {

	public static void main(String[] args) {
		
		String word = "edfacb";
		System.out.println(word);
		char[] ch = word.toCharArray();
		Arrays.sort(ch);
		String word1 = new String(ch);
		System.out.println(word1);
	}
}
