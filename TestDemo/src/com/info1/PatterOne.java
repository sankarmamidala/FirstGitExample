package com.info1;

public class PatterOne {

/*	1 1 1 1 1 1 1 
	1 1 1 1 1 2 2 
	1 1 1 1 3 3 3 
	1 1 1 4 4 4 4 
	1 1 5 5 5 5 5 
	1 6 6 6 6 6 6 
	7 7 7 7 7 7 7 */
	
	public static void main(String[] args) {
		int n = 7;
		int m=n;
		int count = 1;
		for (int i = 1; i <= n; i++) {
			m = m-i;
			for (int j = 1; j <= m; j++) {
				System.out.print(count+" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i+" ");
			}
		
			System.out.println();
			m=n;
		}
	}
}
