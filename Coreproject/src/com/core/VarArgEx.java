package com.core;

public class VarArgEx
{
	static void display(int...num)
	{
		System.out.println("vararg example");
		System.out.println("number is:"+num);
		for(int s:num)
		{
			System.out.println(s*s);
		}
	}

	public static void main(String[] args) {

		display(10,10);
		display(5,5);
	}

}
