package com.info1;

public class GenerateAmstrongNumbers {

	public static void main(String[] args) {
		int rem = 0,sum = 0,n=0,temp=0;
		
		System.out.print("Anstrong Numbers are:: ");
		
		for (int i = 1; i <= 1000; i++) {
			n = i;
			while(n>0) {
				rem = n % 10;
				sum = sum + (rem*rem*rem);
				n = n/10;	
			}
			temp = sum;
			sum = 0;
			if(i == temp) {
				System.out.print(i+" ");
			}
			
		}
	}
}
