package com.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class SecondExample {

	public static void main(String[] args) {
		Integer[] i={1,2,3,4,5,6};
		Integer[] i1={1,2,3,5,8,9,10,11};
		HashSet<Integer> hs=new HashSet<Integer>(Arrays.asList(i));
		HashSet<Integer> hs1=new HashSet<Integer>(Arrays.asList(i1));
		hs.removeAll(hs1);
		System.out.println(hs);
	}

}
