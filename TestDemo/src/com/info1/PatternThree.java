package com.info1;

public class PatternThree {

/*	1
	2 6
	3 7 10
	4 8 11 13
	5 9 12 14 15*/
	
	public static void main(String[] args) {

		int rows = 7;
		
		for (int i = 1; i <= rows; i++) {
			int num = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(num+" ");
				num = num+rows - j;
			}
			System.out.println();
		}
	}
}
