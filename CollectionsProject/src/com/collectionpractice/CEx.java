package com.collectionpractice;

import java.util.TreeSet;

public class CEx {

	public static void main(String[] args)
{
		TreeSet<String> set=new TreeSet<String>(new MyComp());
		set.add("a");
		set.add("n");
		set.add("x");
		set.add("w");
		set.add("g");
		set.add("d");
		
		System.out.println(set);

	}

}
