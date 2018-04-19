package com.info1;

public class PatternSeven {

/*	1 2 3 4 5 6 7 
	 2 3 4 5 6 7 
	  3 4 5 6 7 
	   4 5 6 7 
	    5 6 7 
	     6 7 
	      7 
	     6 7 
	    5 6 7 
	   4 5 6 7 
	  3 4 5 6 7 
	 2 3 4 5 6 7 
	1 2 3 4 5 6 7 
*/
	public static void main(String[] args) {
		int n = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = i; j <= 7; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
			for (int k = 1; k <= i; k++) {
				if(i != 7) {
				System.out.print(" ");
				}
			}
			
			if(i==7) {
				n = i;
			}
		}
		
		int l = n-2;
		for (int p = 1; p <= n-1; p++) {
			
			for (int i = 1; i <= l; i++) {
				System.out.print(" ");
			}
			int m = n-p;
			 for (int j = m; j <=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			l--;
		}
	
	}
}
