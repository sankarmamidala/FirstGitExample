package com.info;

public class BubbleSortDemo {

	
	public static void main(String[] args) {
		

		int[] arr = {45,23,45,67,89,90,12,34};
		int n = arr.length;
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n-i-1; j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}


	}
}
