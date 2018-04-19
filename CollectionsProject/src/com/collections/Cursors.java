package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Cursors {

	public static void main(String[] args)
	{
		
			//Vector v=new Vector();
			ArrayList v=new ArrayList();
			//Iterator v new Iterator()
			for(int i=0;i<=10;i++)
			{
				 v.add(i);
			}
			System.out.println(v);
			ListIterator e=v.listIterator();
			while(e.hasNext())
			{
				Integer i = (Integer)e.next();
//				if(i % 2==0)
//					System.out.println(i);
				if(i.equals(2))
				{
					e.add(143);
				}
				if(i.equals(3))
				{
					e.add(121);
				}
				if(i.equals(10))
					e.set(15);
			}
			System.out.println(v);
	}

}

/*output
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[0, 1, 2, 143, 3, 121, 4, 5, 6, 7, 8, 9, 15]*/

