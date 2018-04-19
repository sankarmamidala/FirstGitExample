package com.overloriding;

public class Overloading1 {


void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(float	a,double b,int c)
	{
		System.out.println(a-b+c);
	}
	public static void main(String[] args) 
	{
		Overloading1 ov=new Overloading1();
		ov.sum(10, 20);
		ov.sum(55.0f,50.0,10);
	}

}
