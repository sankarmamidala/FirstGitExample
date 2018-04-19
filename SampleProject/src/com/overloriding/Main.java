package com.overloriding;

public class Main extends Overid
{
	int a=20;
	void m1()
	{
		System.out.println("m1 method main called");
		//System.out.println(super.a);
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Overid m=new Main();
		m.m1();
		
		System.out.println(m.a);
	}

}