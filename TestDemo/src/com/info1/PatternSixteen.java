package com.info1;

public class PatternSixteen {

/*	1 2 3 4 5 6 7
	1 2 3 4 5 6
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1*/
	public static void main(String[] args) {
	
		int rows =7;
		int n = rows;
		for (int i = 1; i <= rows; i++) {
			
			for (int j = 1; j <= n; j++) {
				System.out.print(j+" ");
			}
			n= rows-i;
			System.out.println();
		}
	}
}
