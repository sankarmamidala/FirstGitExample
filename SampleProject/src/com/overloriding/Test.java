package com.overloriding;

public class Test extends Bank 
{
	int speedlimit=100;
	public static void main(String[] args)
	{
//      Sbi s=new Sbi();
//      System.out.println(s.getRateOfInterst());
//      Icici i=new Icici();
//     System.out.println(i.getRateOfInterst());
		
		Bank b=new Test();
		System.out.println(b.speedlimit);
		
	}

}
