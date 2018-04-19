package com.info1;

public class PatternFour {

/*	1 
	2 2 
	3 3 3 
	4 4 4 4 
	5 5 5 5 5 */
	
	public static void main(String[] args) {

		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				int num = i;
				System.out.print(num + " ");
				num = num + rows - j;
			}
			System.out.println();
		}
	}
}
