package com.info1;

public class PrintCharsInAlphbeticOrder {

	public static void main(String[] args) {
			 
		String word = "sravan";
		char[] ch = word.toCharArray();
		char temp = 0;
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = 0; j < ch.length; j++) {
				
				if(ch[j] > ch[i]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
	}
}
