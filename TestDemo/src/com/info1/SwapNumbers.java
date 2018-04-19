package com.info1;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int num1=10,num2=20,swap=0;
		System.out.println("First Number ::"+num1);
		System.out.println("Second Number ::"+num2);
/*		swap = num1;
		num1 = num2;
		num2 = swap;*/
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("First Number ::"+num1);
		System.out.println("Second Number ::"+num2);
	}
}
