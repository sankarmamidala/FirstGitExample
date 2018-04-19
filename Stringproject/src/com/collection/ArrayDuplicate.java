package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayDuplicate {
	public static void main(String[] args) {
		  
		  // an array that has duplicate and un-orderd numbers
		  // Use Java collections to remove duplicates and order the array

		  Integer arr[]={1,-1,2,4,-5,1,3,2};
		  
		  List list = new ArrayList();
		  //Convert array to list
		  list=Arrays.asList(arr);
		  
		  //Sort the list
		  Collections.sort(list);
		  
		  //Add the list to Treeset
		  Set s= new TreeSet(list);
		  
		  Integer newarr[] = new Integer[s.size()];
		  
		  // Add elements of Treeset into array
		  s.toArray(newarr);
		  
		  // Here you go. Sorted elements in the array
		  for(Integer a1 : newarr){
		   System.out.println(a1);
		  }
		 }

		}
