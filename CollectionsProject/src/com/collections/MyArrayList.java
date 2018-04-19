package com.collections;

import java.util.Arrays;

public class MyArrayList<T>
{
	Object[] element;
	int size;
	public void add(T t)
	{
		if(element==null)
			element=new Object[2];
		else if(size==element.length-1)
		{
			int newSize=((element.length*3)/2)+1;
			element=Arrays.copyOf(element, newSize);		
	}
	element[size]=t;
	size++;
}
public T get(int position)
{
	return (T) element[position];
}

}