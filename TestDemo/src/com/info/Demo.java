package com.info;

public class Demo {

	public static void main(String[] args) {
		
		TestOne test = new TestTwo();
		test.methodOne();
		test.methodOne(10);
		test.methodOne(10, 20);
		TestTwo.methodTwo();
	}
}
