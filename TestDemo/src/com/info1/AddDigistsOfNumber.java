package com.info1;

public class AddDigistsOfNumber {

	public static void main(String[] args) {
		
		int n=12345,rem=0,sum=0;
		while(n>0) {
			rem = n%10;
			sum = sum+rem;
			n = n/10;
		}
		
		System.out.println(sum);
	}
}
