package com.core4s;

public class ExceptionEx 
{
	public static void main(String[] args) {
		try
		{
			System.out.println("try");
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch");
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
		//System.out.println("Now, This statement will also be executed");
		finally
		{
			System.out.println("finally");
		}
		System.out.println("hi");
		
		System.out.println("bhjvjh");
	}

}
