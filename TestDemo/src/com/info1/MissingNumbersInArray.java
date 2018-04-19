package com.info1;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		boolean flag = false;
		int max = 0;
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 11,20,30};
		max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}

		System.out.print("Missing Numbers are :: ");
		for (int i = 1; i <= max; i++) {

			for (int j = 0; j < numbers.length; j++) {

				if (i == numbers[j]) {
					flag = true;
				}
			}
			
			if(flag) {
				flag = false;
			}else {
				System.out.print(i+" ");
			}
		}
	}
}
