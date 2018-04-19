package com.single;

public class Test {

	public static void main(String[] args) 
	{
		SingletonClass s = SingletonClass.getInstance();
		System.out.println(s.hashCode());
		System.out.println(s.hashCode());
	}

}
