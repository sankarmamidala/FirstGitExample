package com.practiceString;

import java.util.Comparator;

public class CompareEx implements Comparator
{
	public int compare(Object ob1,Object ob2)
	{
		Integer i1=(Integer)ob1;
		Integer i2=(Integer)ob2;
		
		return i1.compareTo(i2);
	}
	

}
