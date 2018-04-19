package com.info1;

import java.util.Scanner;

public class FindGiverNumberPrimeOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int number=sc.nextInt();
		int count = 0;
		for (int i = 1; i <= number; i++) {
			
			if(number%i ==0) {
				count = count + 1;
			}
		}
		if(count ==2) {
			
			System.out.println("Given Number is PrimeNumber");
		}
		else {
			System.out.println("Given Number is Not a PrimeNumber");
		}
	}
}
