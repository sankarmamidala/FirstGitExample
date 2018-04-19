package com.info1;

public class PatterTwlve {

/*	1 2 3 4 5 6 7 
	1 2 3 4 5 6 
	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	1 2 3 4 5 6 
	1 2 3 4 5 6 7 */
	
	public static void main(String[] args) {
		int rows = 7;
		int l = rows;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= l; j++) {
				System.out.print(j+" ");
			}
			l = rows-i;
			System.out.println();
		}
		for (int i = 1; i <=rows-1; i++) {
			for (int j = 1; j <= i+1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
