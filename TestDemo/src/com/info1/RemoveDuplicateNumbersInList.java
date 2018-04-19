package com.info1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateNumbersInList {

	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,30,20,10,50};
		List<Integer> list = new ArrayList<>();
		for (int i : numbers) {
			list.add(i);
		}
		System.out.println(list);
		Set<Integer> set = new HashSet<>();
		
		Object[] array = list.toArray();
		for (Object object : array) {
			
			if(list.indexOf(object) != list.lastIndexOf(object)) {
				
				list.remove((Integer) object);
				set.add((Integer) object);
				
			}
		}
		
		System.out.println(list);
	}
}
