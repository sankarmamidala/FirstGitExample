package com.newThread;

public class Producer extends Thread
{
	public void run()
	{
	for(int i=0;i<7;i++)
	{
		System.out.println("producer thread:"+i);
		//Thread.yield();
	}
	}

}
