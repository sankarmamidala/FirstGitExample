package com.info1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindMaxOccuranceCharInString {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();
		String word = "ssssyyyrrr";
		for (int i = 0; i < word.length(); i++) {

			if (map.containsKey(word.charAt(i))) {
				map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
			} else {
				map.put(word.charAt(i), 1);
			}
		}

		Set<Character> keys = map.keySet();
		Integer[] arr = new Integer[keys.size()];
		int i = 0;
		int max = 0;
		for (Character ch : keys) {
			arr[i] = map.get(ch);
			i++;
		}

		max = arr[0];

		for (int j = 0; j < arr.length; j++) {

			if (max < arr[j]) {

				max = arr[j];
			}
		}

		for (Character ch : keys) {

			if (max == map.get(ch)) {
				System.out.print(ch + " " + "is maximum occurance in string" + " " + max);
			}
			System.out.println();
		}
	}
}
