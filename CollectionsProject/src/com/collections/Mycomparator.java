package com.collections;

import java.util.Comparator;

public class Mycomparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2; 
		
		//return i1.compareTo(i2);
		return -i1.compareTo(i2);
		
		
		/*if(i1<i2)
			return 1;
		else if(i1>i2)
			return -1;
		else
			return 0;*/
		
	}

}
