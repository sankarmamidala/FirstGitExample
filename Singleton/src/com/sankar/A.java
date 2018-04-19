package com.sankar;

public class A 
{
	public static A a;
	private A()
	{
		
	}
	public static A getRef()
	{
		if(a==null)
		{
			a=new A();
		}
		return a;
	}
}

