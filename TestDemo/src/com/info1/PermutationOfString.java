package com.info1;

public class PermutationOfString {

	static int count = 0;

	public static void main(String[] args) {
		String word = "abc";
		int count = permutations(word);
		System.out.println("Total Number of Combinations::" + count);
	}

	public static int permutations(String word) {

		return permutations("", word);
	}

	private static int permutations(String prefix, String word) {
		int n = word.length();
		if (n == 0) {
			System.out.println(prefix);
			count++;
		} else {
			for (int i = 0; i < n; i++) {
				permutations(prefix + word.charAt(i), word.substring(0, i) + word.substring(i + 1, n));
			}
		}
		return count;
	}
}
