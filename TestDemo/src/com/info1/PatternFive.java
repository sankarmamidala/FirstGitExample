package com.info1;

public class PatternFive {

/*	1 0 1 0 1 0 1 
	0 1 0 1 0 1 0 
	1 0 1 0 1 0 1 
	0 1 0 1 0 1 0 
	1 0 1 0 1 0 1 
	0 1 0 1 0 1 0 
	1 0 1 0 1 0 1 */
	
	public static void main(String[] args) {
		int count = 1;
		
		for (int i = 1; i <= 7; i++) {
			
			for (int j = 1; j <= 7; j++) {
				
				if(count == 1) {
					System.out.print(count+" ");
					count = 0;
				}else {
					System.out.print(count+" ");
					count = 1;
				}
			}
			System.out.println();
		}
	}
}
