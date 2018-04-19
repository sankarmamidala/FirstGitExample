package com.overloriding;

public class IAExample extends ABExample 
{
	IAExample()
	{
		super.m1();
	}

	void m1()
	{
		System.out.println("m1ex");
	}
	void m2()
	{
		System.out.println("IA");
	}
public static void main(String[] args) {
	IAExample ai =new IAExample();
	ai.m1();
}
}
