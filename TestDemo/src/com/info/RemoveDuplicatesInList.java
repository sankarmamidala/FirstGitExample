package com.info;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInList {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2,3,4,5,3,1,2,4,6,8};
		List<Integer> list = new ArrayList<>();
		for (int i : arr) {
			list.add(i);
		}
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>();
		
		Object[] array = list.toArray();
		
		List<Integer> list1 = new ArrayList<>();
		
		for (Object object : array) {
			if(list.indexOf(object) != list.lastIndexOf(object)) {
				list.remove(list.lastIndexOf(object));
				set.add((Integer)object);
			}
			System.out.println(list);
		}
		System.out.print("Repeated numbers are ");
		for (Integer integer : set) {
		
			System.out.print(integer+" ");
		}
		System.out.println();
		System.out.println(list);
	}

}
