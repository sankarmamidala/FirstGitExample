package com.core;

public class ClassB extends ClassA
{

	public static void main(String[] args) {
ClassB a=new ClassB();
a.m1();
a.m2();
a.m3();
a.m4();
	}

	@Override
	void m2()
	{
		System.out.println("abstract-m2");
		
	}

	@Override
	void m3() {
		System.out.println("abstract-m3");
		
	}
	void m4()
	{
		System.out.println("subclass-m4");
	}

}
