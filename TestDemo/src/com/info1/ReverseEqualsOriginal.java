package com.info1;

public class ReverseEqualsOriginal {

	public static void main(String[] args) {
		
		int n=12321,rev=0,rem=0;
		int m = n;
		while(n>0) {
			
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;	
		}
		if(rev == m) {
			System.out.println("reverse and original number is same");
		}else {
			System.out.println("reverse and original number is not same");
		}
	}
}
