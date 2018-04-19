package com.string;

import java.util.Date;

public class Test 
{
	public static void main(String[] args) {
		
		
		ImmutableEx ie=ImmutableEx.createInstance("sankar",27,new Date());
		System.out.println(ie);
		tryMOdification(ie.getName(),ie.getAge(),ie.getDate());
		System.out.println(ie);
		
		}
	public static void tryMOdification(String name,int age,Date date)
	{
		name="siva";
		age=30;
		date.setDate(10);
	}
}
