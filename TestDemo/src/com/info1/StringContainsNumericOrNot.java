package com.info1;

public class StringContainsNumericOrNot {
	
	public static void main(String[] args) {
		
		String word = "12345";
		boolean flag = false;
		for (int i = 0; i < word.length(); i++) {
			
			if(Character.isDigit(word.charAt(i))) {
				flag = true;
			}
		}

		if(flag) {
			System.out.println("Given String conatain numerics");
		}else {
			System.out.println("Given String does not conatain numerics");
		}
	}
}
