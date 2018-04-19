package com.info1;

public class FibonosisSeries {

	public static void main(String[] args) {
		
		int a=0,b=1,c=0;
		System.out.print(a+" "+b+" ");
		c= a+b;
		int limit = 20;
		limit = limit-2;
		while(limit>0) {
			System.out.print(c+" ");
			a = b;
			b = c;
			c = a + b;
			limit--;
		}
	}
}
