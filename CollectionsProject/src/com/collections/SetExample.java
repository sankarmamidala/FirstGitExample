package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetExample {

	public static void main(String[] args)
{
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("sankar");
		hs.add(123);
		hs.add(12.3);
		hs.add('a');
		hs.add('a');
		hs.add('a');
		hs.add('a');
		System.out.println(hs);
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			Object next = i.next();
			System.out.println(next);
			
		}
		System.out.println(hs);
	}

}

/*Output
[sankar, 123, 12.3, a]
sankar
123
12.3
a
[sankar, 123, 12.3, a]*/
