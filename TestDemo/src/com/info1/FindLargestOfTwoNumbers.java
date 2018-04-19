package com.info1;

public class FindLargestOfTwoNumbers {

	public static void main(String[] args) {
		int[] numbers = {10,20,10,40,50,60};
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			
			if(max < numbers[i]) {
				max = numbers[i];
			}
		} 
		System.out.println(max);
/*		int n1 = 60,n2 =70;
		if(n1 < n2) {
			System.out.println("max value is ::"+ n2);
		}*/
	}
}
