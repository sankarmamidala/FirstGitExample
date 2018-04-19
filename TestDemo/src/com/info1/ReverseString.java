package com.info1;

public class ReverseString {

	public static void main(String[] args) {
		String word = "sravan";
		String rev ="";
		char[] ch = word.toCharArray();
		System.out.println(ch.length);
		for (int i = ch.length-1; i >= 0; i--) {
			rev = rev+ch[i];
		}
		System.out.println(rev);
	}
}
