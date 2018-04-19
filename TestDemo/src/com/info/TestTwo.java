package com.info;

public class TestTwo extends TestOne{

	public void methodOne() {
		System.out.println("methodOne ---testTwo");
	}
	
	public void methodOne(int a) {
		
		System.out.println("1 param ---TestTwo");
	}
	
	public void methodOne(int a, int b) {
		
		System.out.println("2 param ---TestTwo");
	}
	
	public static void methodTwo() {
		System.out.println("methodTwo---TestTwo");
	}
}
