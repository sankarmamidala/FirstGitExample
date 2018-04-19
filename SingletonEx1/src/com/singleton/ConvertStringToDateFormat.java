package com.singleton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDateFormat {

	public static void main(String[] args) {
		SimpleDateFormat formatter=new SimpleDateFormat("yy/mm/dd");
		String dateInString="2015/11/19";
		try
		{
		Date date=formatter.parse(dateInString);
		System.out.println("Converting String to date format:"+formatter.format(date));
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
