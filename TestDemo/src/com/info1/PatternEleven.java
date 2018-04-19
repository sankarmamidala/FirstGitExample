package com.info1;

public class PatternEleven {

/*        1 
        1 2 1 
      1 2 3 2 1 
    1 2 3 4 3 2 1 
  1 2 3 4 5 4 3 2 1 
 1 2 3 4 5 6 5 4 3 2 1 
1 2 3 4 5 6 7 6 5 4 3 2 1 */

	public static void main(String[] args) {
		int rows = 7;
		int space = rows;
		for (int i = 1; i <= rows; i++) {
			space = space-i;
		  for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			for (int j = i-1; j >= 1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			space = rows;
		}
		
	}
}
