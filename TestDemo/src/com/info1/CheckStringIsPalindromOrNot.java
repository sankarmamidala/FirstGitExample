package com.info1;

public class CheckStringIsPalindromOrNot {

	public static void main(String[] args) {

		String original = "sravan";
		String reverse = "";
		char[] ch = original.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			reverse = reverse+ch[i];
		}
		if(reverse.equalsIgnoreCase(original)) {
			System.out.println(original+" "+ "is Palindrome");
		}else {
			System.out.println(original+" "+ "is Not a Palindrome");
		}
	}
}
