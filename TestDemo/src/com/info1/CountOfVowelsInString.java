package com.info1;

public class CountOfVowelsInString {

	public static void main(String[] args) {
		String word = "sravankumar";
		String word1 ="aeiou";
		int count = 0;
		for (int i = 0; i < word1.length(); i++) {
			
			for (int j = 0; j < word.length(); j++) {
				
				if(word1.charAt(i) == word.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println("Count of Vowels in"+" "+"("+word+")"+" "+" "+ count);
		System.out.println("Count of Consonants in"+" "+"("+word+")"+" "+" "+ (word.length()-count));
	}
}
