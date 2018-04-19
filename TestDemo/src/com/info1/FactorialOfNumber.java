package com.info1;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int n=6,fact=1;
		for (int i = 1; i <=n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
