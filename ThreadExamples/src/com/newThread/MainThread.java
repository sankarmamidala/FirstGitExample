package com.newThread;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
	
		Mythread mt = new Mythread();
		mt.start();
		mt.join(20000);
		System.out.println("rama");
		System.out.println("rama");
		System.out.println("rama");
		System.out.println("rama");
		
		
	}
}
