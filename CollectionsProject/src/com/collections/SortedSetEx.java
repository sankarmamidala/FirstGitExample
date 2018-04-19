package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet s=new TreeSet();
		
		s.add(100);
		s.add(101);
		s.add(102);
		s.add(101);
		s.add(101);
		s.add(101);
		s.add(103);
		s.add(104);
		s.add(105);
		s.add(107);
		System.out.println(s);
		System.out.println(s.headSet(104));
		System.out.println(s.tailSet(105));
		System.out.println(s.subSet(101,106));
		System.out.println(s.comparator());

	}

}

//Output
/*[100, 101, 102, 103, 104, 105, 106, 107]
[100, 101, 102, 103]
[105, 106, 107]
[101, 102, 103, 104, 105]
null*/
