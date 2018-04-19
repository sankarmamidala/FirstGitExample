package com.info;

import java.util.ArrayList;
import java.util.List;

public class FindMaxNumberInWindow {
	
	public static void main(String[] args) {
		
		int[] arr = {2,3,4,5,7,6,5,8};
		int max = 0;
		for (int i = 0; i <= arr.length-3; i++) {
			
			for (int j = i; j <= i+2; j++) {

				System.out.print(arr[j]+",");
				max = arr[i];
				
				if(max < arr[j]) {
					
					max = arr[j];
				}
				
			}
			System.out.print("------Maximum Number "+ max);
			System.out.print(" ");
			
		}
	}

}
