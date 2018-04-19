package com.collections;

public class MyArrayListMain {

	public static void main(String[] args)
	{
		MyArrayList<Integer> l=new MyArrayList<Integer>();
		l.add(5);
		l.add(7);
		l.add(8);
		l.add(2);
		l.add(57);
		l.add(4);
		l.add(3);
		l.add(2);
		System.out.println(l.element.length);
		for(int i=0;i<l.size;i++)
		{
			System.out.println(l.get(i));
		}
		}
}	
