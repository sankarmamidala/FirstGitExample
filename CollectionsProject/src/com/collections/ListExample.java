package com.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ListExample {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("sankar");
		al.add(123);
		al.add(123);
		System.out.println(al);
//		al.add(8,	"siva");
//	    al.add(1,	"siva");
	    System.out.println(al);
	    Object ob=al.get(1);
	    System.out.println(ob);
	    
	    LinkedList l=new LinkedList();
	    l.add("a");
	    l.add("b");
	    l.add("d");
	    l.add("e");
	   // l.add("h");
	    l.add("g");
	    System.out.println(l);
	    l.add(2,"c");
	    System.out.println(l);
        boolean remove = l.remove("h");
        System.out.println(remove);
        System.out.println(l);
        l.add(5,"f");
        l.add(7,"h");
        System.out.println(l);
        Object removeFirst = l.removeFirst();
        System.out.println(l);
        l.add(null);
        l.add(null);
        l.add(null);
        System.out.println(l);
	}

}
/*output
[sankar, 123, 123]
[sankar, 123, 123]
123
[a, b, d, e, g]
[a, b, c, d, e, g]
false
[a, b, c, d, e, g]
[a, b, c, d, e, f, g, h]
[b, c, d, e, f, g, h]
[b, c, d, e, f, g, h, null, null, null]*/

