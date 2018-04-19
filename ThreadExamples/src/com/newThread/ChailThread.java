package com.newThread;


public class ChailThread extends Thread
{
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(new Runnable()
	{
				
		public void run()
		{
			System.out.println("first task completed:");
			System.out.println("wait for 2seconds:");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("first task completed");
			
		}
		
	});	
		
		Thread t2 =new Thread(new Runnable()
				{

					@Override
					public void run() {

						System.out.println("second task completed");
					}
			
				});
		
		
		t1.start();
		t2.join();
		t2.start();
		t1.join();
		
	}
	
	
}