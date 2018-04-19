package com.info1;

public class SumOfPairsInArray {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		int sum = 9;
		System.out.println("Pair of number whose sum is ::"+ sum);
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = i+1; j < numbers.length; j++) {
				
				if(sum == (numbers[i]+numbers[j])) {
					System.out.print("("+numbers[i]+","+numbers[j]+")"+"\n");
				}
			}
			
		}
	}
}
