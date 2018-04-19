package com.coreex;

import java.io.IOException;

public class Sample extends A
{
	
	 final int a=90;
	void msg()
	{
		
		
		System.out.println("chaild");
	}
	
	
	public static void main(String[] args) {
		
		Sample s=new Sample();
		s.msg();
		//System.out.println(s.a);
	}

}
