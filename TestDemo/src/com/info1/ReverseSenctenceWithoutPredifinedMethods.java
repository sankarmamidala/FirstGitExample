package com.info1;

public class ReverseSenctenceWithoutPredifinedMethods {

	public static void main(String[] args) {
		String rev = "";
		String sentense = "Hello sravankumar how are you";
		String[] words = sentense.split(" ");
		for (int i = words.length-1; i >= 0; i--) {
			System.out.print(words[i]+" ");
		}
	}
}
