package com.collections;

import java.util.Comparator;

public class MyCompar implements Comparator
{

	public int compare(Object obj1,Object obj2)
	{
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		return e1.compareTo(e2);
	}

}
