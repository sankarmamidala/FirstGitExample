package ListCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayEx {

	public static String getValue(Object value)
	{
		return "object";
	}
	public static String getValue(String value)
	{
		return "string";
	}
	
	public static String getValue(int value)
	{
		return "integer";
	}
	 public static void main(String[] args) {
		 
		 
		 System.out.println(getValue(null));
	 }}