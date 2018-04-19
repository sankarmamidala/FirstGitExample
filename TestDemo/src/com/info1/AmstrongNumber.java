package com.info1;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		int rem = 0,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		int originalNumber = number;
		while(number>0) {
			rem = number%10;
			sum = sum +(rem*rem*rem);
			number = number/10;
		}
		if(sum == originalNumber) {
			System.out.println("Given Number is AmstrongNumber");
		}else {
			System.out.println("Given Number is Not an AmstrongNumber");
		}
	}
}
