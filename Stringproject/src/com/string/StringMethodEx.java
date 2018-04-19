package com.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringMethodEx
{
	
	
	public static void main(String[] args) throws ParseException
	{
		//converts String to Date
//		String str="2016/05/03";
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mm/dd");
//		Date date = sdf.parse(str);
//		System.out.println(date);
		
		//converts Date to String
		
//		Date date=new Date();
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mm/dd");
//		String format = sdf.format(date);
//		System.out.println(format);
		Date date = new Date();
		  System.out.println("Today is " + date);
}
}