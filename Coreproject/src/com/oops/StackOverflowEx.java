package com.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StackOverflowEx
{
	public static void stackE(int num)
	{
		System.out.println("number:"+num);
		if( num == 0)
			return;
		else 
			stackE(++num);
	}
	public static void main(String[] args) {
		StackOverflowEx.stackE(1);
	}
}