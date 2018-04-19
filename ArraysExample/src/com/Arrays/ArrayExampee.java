package com.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExampee {

	public static void main(String[] args) 
	{
		Integer[] number={1,2,4,6,78,2,10};
		int[] arr1={1,2,3,4,5,6};
		int[] arr2={2,3,4,5,6,7};
		int[] arr3={3,4,5,6,7,8};
		int[] arr4={1,2,3,4,5,6};
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr3, arr4));
		System.out.println(Arrays.equals(arr1, arr4));
		int min=(int)Collections.min(Arrays.asList(number));
		int max=(int)Collections.max(Arrays.asList(number));
		System.out.println("minimum:"+min);
		System.out.println("maximum:"+max);
	}

}
