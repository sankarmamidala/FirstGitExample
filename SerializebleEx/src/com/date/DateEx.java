package com.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx
{
	 public static void main(String[] args)throws Exception {  
		 Date date = new Date();  
		    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		   Date date1=formatter.parse("09/09/2016"); 
		   System.out.println(date1);
		
		
		
}}
