package com.collection;

import java.util.Arrays;

public class CustomArrayListEx<T>
{
	Object[] element;
	
	int size;
public void add(T t)
{
	if(element==null)
	{
		element=new Object[2];
	}
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
public static void main(String[] args) {
	  CustomArrayListEx<Integer> l = new CustomArrayListEx<Integer>();
	  
	  l.add(31);
	  l.add(62);
	  l.add(35);
	  l.add(74);
	  l.add(58);
	  l.add(67);
	  l.add(78);
	  l.add(99);

	  
	  for(int i=0;i<l.size;i++)
	  {
	   System.out.println(l.get(i));
	     
	  }
	  System.out.println("Size of array : "+l.element.length);
	 }
	}

