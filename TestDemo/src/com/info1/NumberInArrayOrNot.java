package com.info1;

public class NumberInArrayOrNot {

	public static void main(String[] args) {
		boolean flag = false;
		int[] numbers = {1,2,3,4,5,6,7};
		int n = 14;
		for (int i = 0; i < numbers.length; i++) {
			
			if(n == numbers[i]) {
				flag = true;
			}
		}
		if( ! flag) {
			System.out.println("Given Number is not contained in array");
		}else {
			System.out.println("Given Number is contained in array");
		}
	}
}
