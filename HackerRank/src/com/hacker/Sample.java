package com.hacker;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		 int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
	        Scanner scan = new Scanner(System.in);
			String t=  "is the best place to learn and practice codeing";
	        System.out.println("Enter the integer value");
	        int c=scan.nextInt();
	        int a=i+c;
	        System.out.println("int value:"+a);
	        System.out.println("Enter the double value");
	        double f=scan.nextDouble();
	        System.out.println("Double value:"+d+f);
	        System.out.println(s.concat(t));
	        //System.out.println(s+t);
	}

}
