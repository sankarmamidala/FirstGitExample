package com.collections;

import java.util.ArrayList;

public class ArraysExm {

	public static void main(String[] args) 
	{
		/*ArrayList al=new ArrayList();
		al.add("sankar");
		al.add("siva");
		al.add(new Student(0, null, 0));
		String name1=(String) al.get(0);
		System.out.println(name1);
		String name2=(String) al.get(1);
		System.out.println(name2);
		Object name3= al.get(2);
		System.out.println(name3);
		*/
		
		ArrayList<String> al=new ArrayList<String> ();
		al.add("sankar");
		al.add("siva");
		String name1=al.get(0);
		System.out.println(name1);
		String name2=al.get(1);
		System.out.println(name2);
	}

}
