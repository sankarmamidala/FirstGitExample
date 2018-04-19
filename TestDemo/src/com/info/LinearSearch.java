package com.info;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int element = 10;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == element) {
				
				System.out.println("Element "+" " + element +" "+ "present at "+" " +(i+1) +"th "+ "location");
				break;
			}
			
			if(i == arr.length-1) {
				
				System.out.println("Element not found");
			}
		}
		
	}
}
