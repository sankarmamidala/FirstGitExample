package com.thread;

public class Single 
{
	public static void main(String[] args) {
		
		String str="9247261820";
		System.out.println(str.length());
		char[] cs = str.toCharArray();
		System.out.println(cs);
		
		for( int i=cs.length-1;i>=0;i--)
		{
			System.out.print(cs[i]);
		}
		
	}
}
