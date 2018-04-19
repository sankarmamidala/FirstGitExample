package com.info1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RepeatCountNumbers {

	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new HashMap<>();
		int[] numbers = {10,20,20,30,40,50,10,30,20,40,50,30,60,70,80};
		
		for (int i : numbers) {
			
			if(map.containsKey(Integer.valueOf(i))) {
				
				map.put(Integer.valueOf(i), map.get(Integer.valueOf(i))+1);
				
			}else {
				
				map.put(Integer.valueOf(i), 1);
			}
		}
		Set<Integer> keys = map.keySet();
		for (Integer value : keys) {
			
			System.out.println(value + " "+ "is repeated for"+" "+ map.get(value)+" "+"times");
			
		}
					
	}
}
