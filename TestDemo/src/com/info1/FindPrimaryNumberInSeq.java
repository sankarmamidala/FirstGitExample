package com.info1;

public class FindPrimaryNumberInSeq {
	
	public static void main(String[] args) {
		String primeNumber = "";
		for (int i = 0; i <= 100; i++) {
			int count = 0;
			for (int j = i; j>=1; j--) {
				
				if(i%j == 0) {
					
					count = count + 1;
					
				}
			}
			
			if(count == 2) {
				
				primeNumber = primeNumber + i +" ";
			}
		}
		
		System.out.println("Primary numbers are::"+primeNumber);
		
	}

}
