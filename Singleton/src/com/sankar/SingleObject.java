package com.sankar;

public class SingleObject 
{
	private static SingleObject instance=null;
	private SingleObject(){
		
	}
	public static SingleObject getInstance()
	{
		return instance;
	}
	public void showMessage()
	{
		System.out.println("hi single");
	}
	
}
	

	


