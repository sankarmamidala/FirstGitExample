package com.info;

public class FindPrimeNumber {
	
	public static void main(String[] args) {
		
		int n = 22;
		int m = 17/2;
		
		boolean prime = false;
		for (int i = 2; i <= m; i++) {
			
			if(n%i == 0) {
				prime = true;
			}	
		}
		
		
		if(prime == true) {
			System.out.println("Not Prime Number");
		}else {
			System.out.println("Prime Number");
		}
	}

}
