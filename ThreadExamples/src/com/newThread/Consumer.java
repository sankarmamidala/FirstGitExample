package com.newThread;

public class Consumer extends Thread
{
	public void run()
	{
	for(int i=0;i<7;i++)
	{
		System.out.println("consumer thread:"+i);
		//Thread.yield();
		}
	}

}
