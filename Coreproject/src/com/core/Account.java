package com.core;

public class Account
{
	void m1()
	{
		System.out.println("m1-A");
		//m2();
		this.m2();
		
	}
	void m2()
	{
		System.out.println("m2-a");
	}
	Account()
	{
		this(10);
		System.out.println("con");
	}
	Account(int i)
	{
		System.out.println("con2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ac=new Account();
		ac.m1();
	}

}
