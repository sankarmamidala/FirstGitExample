package com.single;

public class SingletonClass 
{
	private static SingletonClass Object;
	private SingletonClass()
	{
		System.out.println("Singleton(): Private constructor invoked");
	}
	public static  SingletonClass getInstance()
	{
		if(Object==null)
		{
			synchronized(SingletonClass.class){
				if(Object == null){
					System.out.println("getInstance() will called first time:");
					Object = new SingletonClass();
					
				}
			}
				}
		return Object;
	}

}
