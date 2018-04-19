package com.info;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatCount {
	
	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new HashMap<>();

		int[] arr = {10,20,20,30,40,40,30,50,10,60,30};
		
		for (int i : arr) {
			if(map.containsKey(Integer.valueOf(i))) {
				map.put(Integer.valueOf(i), map.get(Integer.valueOf(i))+1);
			}else {
				map.put(Integer.valueOf(i), 1);
			}
		}
		
	Set<Integer> keySet = map.keySet();
	for (Integer integer : keySet) {
		
		System.out.println(integer + " is repeated for "+ map.get(integer)+ " times");
	}

	}

}
