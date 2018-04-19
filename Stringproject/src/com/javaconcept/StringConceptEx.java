package com.javaconcept;

import java.util.HashMap;


public class StringConceptEx {

   public static void main(String[] args) {

	   String str="sankar";
	   String reverse="";
	   char[] ca=str.toCharArray();
	   
	   for(int i=ca.length-1;i>=0;i--)
	   {
		   System.out.print(ca[i]);
	   }
	   
	   for(int i=str.length()-1;i>=0;i--)
	   {
		   reverse+=str.charAt(i);
	   }
	   System.out.println("\n");
	   System.out.print(reverse);
}
 
    }

