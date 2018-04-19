package com.info1;

public class PyramidShapeTwo {
	
	public static void main(String[] args) {
		

		int k=18;
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k=k-2;
			for (int j = 0; j <= i; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
