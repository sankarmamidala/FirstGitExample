package com.overloriding;

import java.io.IOException;

public class Bike extends Vehicle {

	public void m1() throws ArithmeticException
	{
		System.out.println("run");
	}
	public static void main(String[] args) {

		Bike b = new Bike();
		b.m1();
		
	}

}
