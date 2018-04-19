package com.collections;

import java.util.TreeSet;

public class Compareb {

	public static void main(String[] args)
	{
System.out.println("a".compareTo("b"));
System.out.println("f".compareTo("l"));
System.out.println("x".compareTo("t"));
System.out.println("m".compareTo("m"));

TreeSet<Integer> t=new TreeSet<Integer>(new Mycomparator());
t.add(2);
t.add(5);
t.add(9);
t.add(8);
t.add(4);
t.add(5);
t.add(8);
System.out.println(t);
	}

}
