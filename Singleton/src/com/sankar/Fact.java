package com.sankar;

public class Fact {

	public static void main(String[] args) {
		int fact=1;
		int n=5;
		for(int i=n;i>1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
