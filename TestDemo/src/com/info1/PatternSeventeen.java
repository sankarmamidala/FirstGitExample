package com.info1;

public class PatternSeventeen {

/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
	public static void main(String[] args) {
		int rows = 7;
		int n = rows-1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= (rows-1); i++) {
			
			for (int j = 1; j <= n; j++) {
				System.out.print(j+" ");
			}
			n--;
			System.out.println();
		}
		
	}
}
