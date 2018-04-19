package com.info1;

public class CountNumbersOfBrackets {

	public static void main(String[] args) {
	
		String pattern = "(())()()";
		char c1 = '(';
		char c2 = ')';
		int count1 = 0;
		int count2 = 0;
		
		char[] ch = pattern.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(c1 == ch[i]) {
				count1++;
			}else {
				count2++;
			}
		}
		if(count1 == count2) {
			System.out.println((count1+count2)/2);
		}else {
			System.out.println("-1");
		}
		
	}
}
