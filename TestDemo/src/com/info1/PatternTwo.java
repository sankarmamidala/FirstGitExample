package com.info1;

public class PatternTwo {

/*	0 0 0 0 0 0 0
	0 1 0 0 0 0 0
	0 0 2 0 0 0 0
	0 0 0 3 0 0 0
	0 0 0 0 4 0 0
	0 0 0 0 0 5 0
	0 0 0 0 0 0 6  */
	
	public static void main(String[] args) {
		int n =7;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if(i == j) {
					System.out.print(i+" ");
				}else {
					System.out.print("0"+" ");
				}
			}
			System.out.println();
		}
	}
}
